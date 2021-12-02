package level14.exam06;

import java.util.Scanner;

public class triangle {
	
	// ���� : https://www.acmicpc.net/problem/1932
	public static Integer[][] dp; // int �迭 ���� �� 0�� ����Ʈ�� �ʱ�ȭ�Ǵµ�, ���� ������ ��ġ�� �ȴ�.
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
		
		// ���� ������ ���� ������ DP�� ������ �࿡�� �Ȱ��� ���� 
		for(int i=0; i<N; i++) {
			dp[N-1][i] = triangle[N-1][i];
		}
		
		System.out.print(find(0, 0));

	}

	private static int find(int depth, int idx) {
		// ���� �� ��(����)�� �࿡ �����ϸ� �ش� �ε����� ��ȯ�Ѵ�.
		if(depth == N - 1) {
			return dp[depth][idx];
		}
		// Ž������ �ʾҴ� ���� ��� ���� ���� ���� �� ��.
		if(dp[depth][idx] == null) {
			/*
			 * �ٷ� �������� �ε����� �� �������� �ε��� ��
			 * ū ���� ã�� dp�� ���� �ε����� ���� ���Ͽ� ����
			 */
			dp[depth][idx] = Math.max(find(depth+1, idx), find(depth+1, idx+1)) + triangle[depth][idx];
		}
		return dp[depth][idx];
	}

}
