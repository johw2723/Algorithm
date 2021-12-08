package level14.exam09;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class eazyStair3 {
	
	// 출저 : https://www.acmicpc.net/problem/10844

	final static long MOD = 1000000000;
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		br.close();
		
		long[][] dp = new long[N+1][10];
		
		// 첫번째 자릿수는 오른쪽 끝의 자릿수이므로 경우의 수가 1개 밖에 없다.
		for(int i=1; i<10; i++) {
			dp[1][i] = 1;
		}
		
		// 두 번째 자릿수부터 N까지 탐색
		for(int i=2; i<=N; i++) {

			// i번째 자릿수부터 N까지 탐색
			for(int j=0; j<10; j++) {
				
				// 자릿값이 0이라면 이전 자릿수의 첫번째 자릿수만 가능
				if(j == 0) {
					dp[i][0] = dp[i-1][1] % MOD;
				}
				
				// j=9 라면 이전 자릿수는 8만 가능
				else if(j == 9) {
					dp[i][9] = dp[i-1][8] % MOD;
				}
				
				// 그 외의 경우는 이전 자릿수의 자릿값에서 +1과 -1한 값
				else {
					dp[i][j] = (dp[i-1][j-1] + dp[i-1][j+1]) % MOD;
				}
			}
		}
		
		long result = 0;
		
		// 각 자릿값마다 경우의 수를 모두 더해준다.
		for(int i=0; i<10; i++) {
			result += dp[N][i];
		}
		
		System.out.println(result%MOD);

	}

}
