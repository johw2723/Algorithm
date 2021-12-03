package level14.exam07;

import java.util.Scanner;

public class climb {
	
	// 출저 : https://www.acmicpc.net/problem/2579
	public static int[] stair;
	public static Integer[] dp;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt(); // 계단의 단수
		
		stair = new int[N+1]; // 시작 단은 0
		dp = new Integer[N+1];
		
		for(int i=1; i<=N; i++) {
			stair[i] = sc.nextInt();
		}
		sc.close();
		
		// 메모이제이션
		dp[0] = stair[0]; // default 값이 null 이므로 0으로 초기화
		dp[1] = stair[1];
		
		if(N >= 2) {
			dp[2] = stair[1] + stair[2];
		}
		System.out.print(score(N));
		

	}

	private static int score(int N) {
		if(dp[N] == null) {
			dp[N] = Math.max(score(N-2),  score(N-3) + stair[N-1]) + stair[N];
			// N-2와 N-3은 재귀호출하지만 N-1은 재귀호출하지 않는다.  
			// 메모이제이션이 아닐 때 까지 호출이 되기 때문이다.
		}
		return dp[N];
	}

}
