package level14.exam04;

import java.util.Scanner;

public class spiral {
	
	// √‚¿˙ : https://www.acmicpc.net/problem/9461
	public static long[] dp = new long[101];

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		
		dp[0] = 0;
		dp[1] = 1;
		dp[2] = 1;
		dp[3] = 1;
		
		for(int i=4; i<dp.length; i++) {
			dp[i] = -1;
		}
		
		for(int i=0; i<T; i++) {
			int N = sc.nextInt();
			System.out.println(spiral(N));
		}	
		
		sc.close();

	}

	private static long spiral(int N) {
		if(dp[N] == -1) {
			dp[N] = spiral(N-2) + spiral(N-3);
		}
		return dp[N];
	}

}
