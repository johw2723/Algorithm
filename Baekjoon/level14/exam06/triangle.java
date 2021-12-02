package level14.exam06;

import java.util.Scanner;

public class triangle {
	
	// 출저 : https://www.acmicpc.net/problem/1932
	public static Integer[][] dp; // int 배열 사용시 값 0이 디폴트로 초기화되는데, 값의 범위와 겹치게 된다.
	public static int[][] triangle;
	public static int N;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		N = sc.nextInt();
		
		dp = new Integer[N][N];
		triangle = new int[N][N];
		for(int i=0; i<N; i++) {
			for(int j=0; j<i+1; j++) {
				triangle[i][j] = sc.nextInt();
			}
		}
		sc.close();
		
		// 가장 마지막 행의 값들을 DP의 마지막 행에도 똑같이 복사 
		for(int i=0; i<N; i++) {
			dp[N-1][i] = triangle[N-1][i];
		}
		
		System.out.print(find(0, 0));

	}

	private static int find(int depth, int idx) {
		// 만약 맨 밑(깊이)의 행에 도달하면 해당 인덱스를 반환한다.
		if(depth == N - 1) {
			return dp[depth][idx];
		}
		// 탐색하지 않았던 값일 경우 다음 행의 양쪽 값 비교.
		if(dp[depth][idx] == null) {
			/*
			 * 바로 다음행의 인덱스와 그 오른쪽의 인덱스 중
			 * 큰 값을 찾아 dp에 현재 인덱스의 값과 더하여 저장
			 */
			dp[depth][idx] = Math.max(find(depth+1, idx), find(depth+1, idx+1)) + triangle[depth][idx];
		}
		return dp[depth][idx];
	}

}
