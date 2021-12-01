package level14.exam05;

import java.util.Scanner;

public class RGB {
	
	// ���� : https://www.acmicpc.net/problem/1149
	final static int R = 0;
	final static int G = 1;
	final static int B = 2;
	public static int[][] dp;
	public static int[][] cost;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt(); // RGB �Ÿ� �� ����
		
		dp = new int[N][3];
		cost = new int[N][3];
		
		// ���� 1 : 1�� ���� ���� 2�� ���� ���� ���� �ʾƾ� �Ѵ�.
		// ���� 2 : N�� ���� ���� N-1�� ���� ���� ���� �ʾƾ� �Ѵ�.
		// ���� 3 : i(2<= i <= N-1)�� ���� ���� i-1��, i+1�� ���� ���� ���� �ʾƾ� �Ѵ�.
		
		for(int i=0; i<N; i++) {
			cost[i][R] = sc.nextInt();
			cost[i][G] = sc.nextInt();
			cost[i][B] = sc.nextInt();
		}
		sc.close();
		
		// �޸������̼� : dp�� ù��° ���� �� �������� ù��° ������ �ʱ�ȭ
		dp[0][R] = cost[0][R];
		dp[0][G] = cost[0][G];
		dp[0][B] = cost[0][B];

		System.out.print(Math.min(Paint_cost(N-1, R), Math.min(Paint_cost(N-1, G), Paint_cost(N-1, B))));
		
	}

	private static int Paint_cost(int N, int color) {
		// Ž������ ���� �迭���� Ȯ��
		if(dp[N][color] == 0) {
			// color ���� ���� ���� ���� ���� �ٸ� ���� ���ȣ���Ͽ� �ּڰ��� ���� ���� ����� ���ؼ� DP�� ����
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
