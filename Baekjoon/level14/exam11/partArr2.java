package level14.exam11;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class partArr2 {
	
	static int[] arr;
	static Integer[] dp;

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		
		arr = new int[N];
		dp = new Integer[N];
		
		StringTokenizer token = new StringTokenizer(br.readLine()," "); 
		for(int i=0; i<N; i++) {
			arr[i] = Integer.parseInt(token.nextToken());
		}
		
		br.close();
		
		/*
		 * arr 10 20 10 30 20 50
		 * dp   1  2  1  3  2  4
		 * dp[0] = {10} : 길이 1
		 * dp[1] = {10, 20} : 길이 2
		 * dp[2] = {10} : 길이 1
		 * dp[3] = {10, 20, 30} : 길이 3
		 * dp[4] = {10, 20} : 길이 2
		 * dp[5] = {10, 20, 30, 50} : 길이 4
		 */
		
		for(int i=0; i<N; i++) {
			program(i);
		}
		
		int max = dp[0];
		for(int i=1; i<N; i++) {
			max = Math.max(max, dp[i]);
		}
		System.out.println(max);
		

	}

	private static int program(int N) {
		if(dp[N] == null) {
			dp[N] = 1; 
			
			for(int i=N-1; i>=0; i--) {
				if(arr[i] < arr[N]) {
					dp[N] = Math.max(dp[N], program(i) + 1);
				}
			}
		}
		return dp[N];
	}

}
