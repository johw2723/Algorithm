package level14.exam05;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class RGB2 {
	
	// 출저 : https://www.acmicpc.net/problem/1149
	final static int R = 0;
	final static int G = 1;
	final static int B = 2;
	public static int dp[][];
	public static int cost[][];

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		
		dp = new int[N][3];
		cost = new int[N][3];
		
		StringTokenizer token;
		for(int i=0; i<N; i++) {
			token = new StringTokenizer(br.readLine(), " ");
			cost[i][R] = Integer.parseInt(token.nextToken());
			cost[i][G] = Integer.parseInt(token.nextToken());
			cost[i][B] = Integer.parseInt(token.nextToken());
		}
		br.close();
		
		// 메모이제이션 : DP의 첫번째 값은 각 색상비용의 첫번째 값으로 초기화
		dp[0][R] = cost[0][R];
		dp[0][G] = cost[0][G];
		dp[0][B] = cost[0][B];
		
		System.out.print(Math.min(Paint_cost(N-1, R), Math.min(Paint_cost(N-1, G), Paint_cost(N-1, B))));
	}

	private static int Paint_cost(int N, int color) {
		// 탐색하지 않은 배열인지 확인
		if(dp[N][color] == 0) {
			// color에 색에 따라 이전 집의 서로 다른 색을 재귀호출하여 최솟값과 현재 집의 비용을 더해서 DP에 저장
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
