package level14.exam04;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class spiral2 {
	
	// √‚¿˙ : https://www.acmicpc.net/problem/9461
	public static long[] dp = new long[101];

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int T = Integer.parseInt(br.readLine());
		
		dp[0] = 0;
		dp[1] = 1;
		dp[2] = 1;
		dp[3] = 1;
		
		for(int i=3; i<dp.length; i++) {
			dp[i] = -1;
		}
		
		for(int i=0; i<T; i++) {
			//int N = Integer.parseInt(br.readLine());
			sb.append(spiral(Integer.parseInt(br.readLine()))).append('\n');
		}
		
		br.close();
		System.out.print(sb);

	}

	private static long spiral(int N) {
		if(dp[N] == -1) {
			dp[N] = spiral(N-2) + spiral(N-3);
		}
		return dp[N];
	}

}
