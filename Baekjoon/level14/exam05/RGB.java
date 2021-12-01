package level14.exam05;

import java.util.Scanner;

public class RGB {
	
	// 출저 : https://www.acmicpc.net/problem/1149
	final static int R = 0;
	final static int G = 1;
	final static int B = 2;
	public static int[][] dp;
	public static int[][] cost;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt(); // RGB 거리 집 개수
		
		dp = new int[N][3];
		cost = new int[N][3];
		
		// 조건 1 : 1번 집의 색은 2번 집의 색과 같지 않아야 한다.
		// 조건 2 : N번 집의 색은 N-1번 집의 색과 같지 않아야 한다.
		// 조건 3 : i(2<= i <= N-1)번 집의 색은 i-1번, i+1번 집의 색과 같지 않아야 한다.
		
		for(int i=0; i<N; i++) {
			cost[i][R] = sc.nextInt();
			cost[i][G] = sc.nextInt();
			cost[i][B] = sc.nextInt();
		}
		sc.close();
		
		// 메모이제이션 : dp의 첫번째 값은 각 색상비용의 첫번째 값으로 초기화
		dp[0][R] = cost[0][R];
		dp[0][G] = cost[0][G];
		dp[0][B] = cost[0][B];

		System.out.print(Math.min(Paint_cost(N-1, R), Math.min(Paint_cost(N-1, G), Paint_cost(N-1, B))));
		
	}

	private static int Paint_cost(int N, int color) {
		// 탐색하지 않은 배열인지 확인
		if(dp[N][color] == 0) {
			// color 색에 따라 이전 집의 서로 다른 색을 재귀호출하여 최솟값과 현재 집의 비용을 더해서 DP에 저장
			if(color == R) {
				dp[N][R] = Math.min(Paint_cost(N-1, G), Paint_cost(N-1, B)) + cost[N][R];
			}
			else if(color == G) {
				dp[N][G] = Math.min(Paint_cost(N-1, R), Paint_cost(N-1, B)) + cost[N][G];
			}
			else {
				dp[N][B] = Math.min(Paint_cost(N-1, R), Paint_cost(N-1, G)) + cost[N][B];
			}
		}
		return dp[N][color];
	}

}
