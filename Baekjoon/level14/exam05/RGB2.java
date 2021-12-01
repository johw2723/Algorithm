package level14.exam05;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class RGB2 {
	
	// ���� : https://www.acmicpc.net/problem/1149
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
		
		// �޸������̼� : DP�� ù��° ���� �� �������� ù��° ������ �ʱ�ȭ
		dp[0][R] = cost[0][R];
		dp[0][G] = cost[0][G];
		dp[0][B] = cost[0][B];
		
		System.out.print(Math.min(Paint_cost(N-1, R), Math.min(Paint_cost(N-1, G), Paint_cost(N-1, B))));
	}

	private static int Paint_cost(int N, int color) {
		// Ž������ ���� �迭���� Ȯ��
		if(dp[N][color] == 0) {
			// color�� ���� ���� ���� ���� ���� �ٸ� ���� ���ȣ���Ͽ� �ּڰ��� ���� ���� ����� ���ؼ� DP�� ����
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
