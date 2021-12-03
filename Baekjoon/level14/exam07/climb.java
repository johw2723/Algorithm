package level14.exam07;

import java.util.Scanner;

public class climb {
	
	// ���� : https://www.acmicpc.net/problem/2579
	public static int[] stair;
	public static Integer[] dp;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt(); // ����� �ܼ�
		
		stair = new int[N+1]; // ���� ���� 0
		dp = new Integer[N+1];
		
		for(int i=1; i<=N; i++) {
			stair[i] = sc.nextInt();
		}
		sc.close();
		
		// �޸������̼�
		dp[0] = stair[0]; // default ���� null �̹Ƿ� 0���� �ʱ�ȭ
		dp[1] = stair[1];
		
		if(N >= 2) {
			dp[2] = stair[1] + stair[2];
		}
		System.out.print(score(N));
		

	}

	private static int score(int N) {
		if(dp[N] == null) {
			dp[N] = Math.max(score(N-2),  score(N-3) + stair[N-1]) + stair[N];
			// N-2�� N-3�� ���ȣ�������� N-1�� ���ȣ������ �ʴ´�.  
			// �޸������̼��� �ƴ� �� ���� ȣ���� �Ǳ� �����̴�.
		}
		return dp[N];
	}

}
