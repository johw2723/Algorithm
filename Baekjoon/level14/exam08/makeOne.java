package level14.exam08;

import java.util.Scanner;

public class makeOne {

	// 출저 : https://www.acmicpc.net/problem/1463
	public static Integer[] dp;
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		sc.close();
		
		dp = new Integer[N+1];
		dp[0] = dp[1] = 0;
		
		System.out.println(make(N));

	}

	private static int make(int N) {
		if(dp[N] == null) {
			// 6으로 나눠지는 경우
			if(N%6 == 0) {
				// 여러 재귀중 최솟값으로 갱신해야한다. 카운트는 1을 더하는 것으로 한다.
				dp[N] = Math.min(make(N-1), Math.min(make(N/3), make(N/2))) + 1;
			}
			// 3으로만 나눠지는 경우
			else if(N%3 == 0) {
				dp[N] = Math.min(make(N/3), make(N-1)) + 1;
			}
			// 2로만 나눠지는 경우
			else if(N%2 == 0) {
				dp[N] = Math.min(make(N/2), make(N-1)) + 1;
			}
			// 2와 3으로 나누어지지 않는 경우
			else {
				dp[N] = make(N-1) + 1;
			}
		}
		return dp[N];
	}

}
