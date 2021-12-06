package level14.exam08;

import java.util.Scanner;

public class makeOne {

	// ���� : https://www.acmicpc.net/problem/1463
	public static Integer[] dp;
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		sc.close();
		
		dp = new Integer[N+1];
		dp[0] = dp[1] = 0;
		
		System.out.println(make(N));

	}

	private static int make(int N) {
		if(dp[N] == null) {
			// 6���� �������� ���
			if(N%6 == 0) {
				// ���� ����� �ּڰ����� �����ؾ��Ѵ�. ī��Ʈ�� 1�� ���ϴ� ������ �Ѵ�.
				dp[N] = Math.min(make(N-1), Math.min(make(N/3), make(N/2))) + 1;
			}
			// 3���θ� �������� ���
			else if(N%3 == 0) {
				dp[N] = Math.min(make(N/3), make(N-1)) + 1;
			}
			// 2�θ� �������� ���
			else if(N%2 == 0) {
				dp[N] = Math.min(make(N/2), make(N-1)) + 1;
			}
			// 2�� 3���� ���������� �ʴ� ���
			else {
				dp[N] = make(N-1) + 1;
			}
		}
		return dp[N];
	}

}
