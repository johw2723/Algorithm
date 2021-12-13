package level14.exam10;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class wine3 {
	
	// 출저 : https://www.acmicpc.net/problem/2156

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		
		int[] dp = new int[N+1];
		int[] wine = new int[N+1];
		
		for(int i=1; i<N+1; i++) {
			wine[i] = Integer.parseInt(br.readLine());
		}
		
		br.close();
		
		// 메모이제이션
		dp[1] = wine[1];
		
		if(N > 1) {
			dp[2] = wine[1] + wine[2];
		}
		
		// 반복문 
		for(int i=3; i<=N; i++) {
			dp[i] = Math.max(dp[i-1], Math.max(dp[i-2] + wine[i], dp[i-3] + wine[i-1] + wine[i]));
		}
		
		System.out.println(dp[N]);

	}

}
