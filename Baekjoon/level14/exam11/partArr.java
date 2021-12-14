package level14.exam11;

import java.util.Scanner;

public class partArr {
	
	static int[] arr;
	static Integer[] dp;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt(); // 수열의 크기
		arr = new int[N];
		dp = new Integer[N];
		
		for(int i=0; i<N; i++) {
			arr[i] = sc.nextInt();
		}
		
		sc.close();
		
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
			max = Math.max(max, dp[i]); // 최댓값 찾기
		}
		System.out.println(max);
		

	}

	private static int program(int N) {
		if(dp[N] == null) {
			dp[N] = 1; // 1로 초기화 : 모든 부분 수열의 길이가 최소한 1이상이기 때문
			
			for(int i=N-1; i>=0; i--) {
				if(arr[i] < arr[N]) {
					dp[N] = Math.max(dp[N], program(i) + 1);
				}
			}
		}
		return dp[N];
	}

}
