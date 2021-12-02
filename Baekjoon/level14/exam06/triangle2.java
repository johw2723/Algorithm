package level14.exam06;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class triangle2 {
	
	// 출저 : https://www.acmicpc.net/problem/1932
	public static Integer[][] dp; // int 배열 사용시 값 0이 디폴트로 초기화되는데, 값의 범위와 겹치게 된다.
	public static int[][] triangle;
	public static int N;

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		N = Integer.parseInt(br.readLine());
		
		dp = new Integer[N][N];
		triangle = new int[N][N];
		
		StringTokenizer token;
		for(int i=0; i<N; i++) {
			token = new StringTokenizer(br.readLine(), " ");
			for(int j=0; j<i+1; j++) {			
				triangle[i][j] = Integer.parseInt(token.nextToken());
			}
		}
		
		for(int i=0; i<N; i++) {
			dp[N-1][i] = triangle[N-1][i];
		}
		
		System.out.print(find(0, 0));
	}

	private static int find(int depth, int idx) {
		
		// 마지막 행 일경우 현재 위치 dp값 반환
		if(depth == N-1) {
			return dp[depth][idx];
		}
		if(dp[depth][idx] == null) {
			dp[depth][idx] = Math.max(find(depth+1, idx), find(depth+1, idx+1)) + triangle[depth][idx];
		}
		return dp[depth][idx];
	}

}
