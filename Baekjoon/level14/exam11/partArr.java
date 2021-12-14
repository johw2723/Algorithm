package level14.exam11;

import java.util.Scanner;

public class partArr {
	
	static int[] arr;
	static Integer[] dp;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt(); // ������ ũ��
		arr = new int[N];
		dp = new Integer[N];
		
		for(int i=0; i<N; i++) {
			arr[i] = sc.nextInt();
		}
		
		sc.close();
		
		/*
		 * arr 10 20 10 30 20 50
		 * dp   1  2  1  3  2  4
		 * dp[0] = {10} : ���� 1
		 * dp[1] = {10, 20} : ���� 2
		 * dp[2] = {10} : ���� 1
		 * dp[3] = {10, 20, 30} : ���� 3
		 * dp[4] = {10, 20} : ���� 2
		 * dp[5] = {10, 20, 30, 50} : ���� 4
		 */
		
		for(int i=0; i<N; i++) {
			program(i);
		}
		
		int max = dp[0];
		for(int i=1; i<N; i++) {
			max = Math.max(max, dp[i]); // �ִ� ã��
		}
		System.out.println(max);
		

	}

	private static int program(int N) {
		if(dp[N] == null) {
			dp[N] = 1; // 1�� �ʱ�ȭ : ��� �κ� ������ ���̰� �ּ��� 1�̻��̱� ����
			
			for(int i=N-1; i>=0; i--) {
				if(arr[i] < arr[N]) {
					dp[N] = Math.max(dp[N], program(i) + 1);
				}
			}
		}
		return dp[N];
	}

}
