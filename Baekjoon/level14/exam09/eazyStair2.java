package level14.exam09;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class eazyStair2 {
	
	// 출저 : https://www.acmicpc.net/problem/10844

	public static Long[][] dp; // 자릿수가 100 까지 주어져서 long타입
	final static long MOD = 1000000000;
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		br.close();
		
		dp = new Long[N+1][10];
		
		// 첫번째 자릿수는 1로 초기화
		for(int i=0; i<10; i++) {
			dp[1][i] = 1L;
		}
		
		long result = 0;
		
		// 마지막 자릿수인 1~9 까지의 경우의 수를 모두 더해준다.
		for(int i=1; i<=9; i++) {
			result += count(N, i);
		}
		
		System.out.println(result%MOD);

	}

	private static long count(int digit, int value) {
		// 첫 번째 자릿수에 도착한다면 더 이상 탐색할 필요가 없다
		if(digit == 1) {
			return dp[digit][value];
		}
		
		// 해당 자릿수의 value값에 대해 탐색하지 않은 경우
		if(dp[digit][value] == null) {
			// value = 0 일 때, 다음은 1 밖에 못온다.
			if(value == 0) {
				dp[digit][value] = count(digit-1, 1);
			}
			// value = 9 일 때, 다음은 8 밖에 못온다.
			else if(value == 9) {
				dp[digit][value] = count(digit-1, 8);
			}
			// 그외 value-1과 value+1을 합한값이 경우의 수가 된다.
			else {
				dp[digit][value] = count(digit-1, value-1) + count(digit-1, value+1);
			}
		}
		return dp[digit][value]%MOD;
	}

}
