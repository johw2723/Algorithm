package level14.exam07;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class climb2 {
	
	// ���� : https://www.acmicpc.net/problem/2579
	public static int[] stair;
	public static Integer[] dp;

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		
		stair = new int[N+1]; // ����� 0���� 0��
		dp = new Integer[N+1];
		
		for(int i=1; i<=N; i++) {
			stair[i] = Integer.parseInt(br.readLine());
		}
		br.close();
		
		// �޸������̼�
		dp[0] = stair[0];
		dp[1] = stair[1];
		
		if(N>=2) {
			dp[2] = stair[1] + stair[2];
		}

		System.out.print(score(N));
		
	}

	private static int score(int N) {
		// ���� Ž������ ���� N��° ����� ���
		if(dp[N] == null) {
			dp[N] = Math.max(score(N-2), score(N-3) + stair[N-1]) + stair[N];
		}
		return dp[N];
	}


}
