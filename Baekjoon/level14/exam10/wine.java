package level14.exam10;

import java.util.Scanner;

public class wine {
	
	// ���� : https://www.acmicpc.net/problem/2156
	public static Integer[] dp; 
	public static int[] wine;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		
		dp = new Integer[N+1];
		wine = new int[N+1];
		
		for(int i=1; i<N+1; i++) {
			wine[i] = sc.nextInt();
		}
		
		sc.close();
		
		// �޸������̼�
		dp[0] = 0;
		dp[1] = wine[1];
		
		if(N > 1) {
			dp[2] = wine[1] + wine[2];
		}
		
		System.out.println(tasting(N));

	}

	private static int tasting(int N) {
		if(dp[N] == null) {
			// ������ ���� �׻� �ִ��� �ƴϱ⿡ N-1�� �ѱ� ���ȣ���� ���� ���Ѵ� 
			dp[N] = Math.max(Math.max(tasting(N-2), tasting(N-3) + wine[N-1]) + wine[N], tasting(N - 1));
		}
		return dp[N];
	}

}
