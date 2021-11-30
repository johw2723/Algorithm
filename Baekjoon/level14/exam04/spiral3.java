package level14.exam04;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class spiral3 {
	
	// √‚¿˙ : https://www.acmicpc.net/problem/9461
	public static long[] dp = new long[101];

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		spiral();
		
		int T = Integer.parseInt(br.readLine());
		
		for(int i=0; i<T; i++) {
			sb.append(dp[Integer.parseInt(br.readLine())]).append('\n');
		}
		
		br.close();
		System.out.print(sb);

	}

	private static void spiral() {
		
		dp[1] = 1;
		dp[2] = 1;
		dp[3] = 1;
		
		for(int i=4; i<101; i++) {
			dp[i] = dp[i-2] + dp[i-3];
		}
	}

}
