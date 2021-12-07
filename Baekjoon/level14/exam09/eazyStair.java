package level14.exam09;

import java.util.Scanner;

public class eazyStair {
	
	// 출저 : https://www.acmicpc.net/problem/10844

	public static Long[][] dp; // 자릿수가 100 까지 주어져서 long타입
	final static long MOD = 1000000000;
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		sc.close();
		
		// N개의 자리를 표현 + 자리에 0~9까지 수를 가질 수 있다.		
		dp = new Long[N+1][10]; 
		
		// 첫번째 자릿수는 1로 초기화 : 첫째 자릿수는 각 자릿값의 끝이기 때문의 1밖에 올 수 없다.
		for(int i=0; i<10; i++) {
			dp[1][i] = 1L;
		}
		
		long result = 0;
		
		// 마지막 자릿수인 1~9까지의 경우의 수를 모두 더해준다.
		for(int i=1; i<=9; i++) {
			result += count(N, i);
		}
		
		System.out.println(result%MOD);

	}

	private static long count(int digit, int value) {
		// digit : 자릿수를 표현
		// value : 자릿값을 표현
		
		// 첫번째 자릿수에 도착한다면 더이상 탐색팔 필요가 없다.
		if(digit == 1) {
			return dp[digit][value];
		}
		
		// 해당 자릿수의 value값에 대해 탐색하지 않았을 경우
		if(dp[digit][value] == null) {
			//value가 0일 경우 다음은 1밖에 못온다.
			if(value == 0) {
				dp[digit][value] = count(digit-1, 1);
			}
			// value가 9일 경우 다음은 8밖에 못옴
			else if(value == 9) {
				dp[digit][value] = count(digit-1, 8);
			}
			// 그외의 경우 : value-1과 value+1값의 경우의 수를 합한 경우의 수가 된다.
			else {
				dp[digit][value] = count(digit-1, value-1) + count(digit-1, value+1);
			}
		}
		return dp[digit][value]%MOD;
	}

}
