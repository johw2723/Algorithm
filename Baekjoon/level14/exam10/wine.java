package level14.exam10;

import java.util.Scanner;

public class wine {
	
	// 출저 : https://www.acmicpc.net/problem/2156
	public static Integer[] dp; 
	public static int[] wine;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		
		dp = new Integer[N+1];
		wine = new int[N+1];
		
		for(int i=1; i<N+1; i++) {
			wine[i] = sc.nextInt();
		}
		
		sc.close();
		
		// 메모이제이션
		dp[0] = 0;
		dp[1] = wine[1];
		
		if(N > 1) {
			dp[2] = wine[1] + wine[2];
		}
		
		System.out.println(tasting(N));

	}

	private static int tasting(int N) {
		if(dp[N] == null) {
			// 마지막 값이 항상 최댓값이 아니기에 N-1을 넘긴 재귀호출의 값과 비교한다 
			dp[N] = Math.max(Math.max(tasting(N-2), tasting(N-3) + wine[N-1]) + wine[N], tasting(N - 1));
		}
		return dp[N];
	}

}
