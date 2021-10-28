package level11.exam04;

import java.util.Scanner;

public class chess {
	
	// ���� : https://www.acmicpc.net/problem/1018
	
	public static boolean[][] arr;
	public static int min = 64; // 8*8 �� �ּ�

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int M = sc.nextInt();
		
		arr = new boolean[N][M];
		
		// �迭 �Է�
		for(int i=0; i<N; i++) {
			String str = sc.next();
			
			for(int j=0; j<M; j++) {
				if(str.charAt(j)=='W') {
					arr[i][j] = true; // W�� �� true
				}
				else {
					arr[i][j] = false; // B�� �� false
				}
			}
		}
		sc.close();
		
		int N_row = N-7; // N�� : �ּ� ũ�Ⱑ 8*8 �� �� ����� ���� 1���̱� ������ �� ���̿� -7�� ���ش�. 
		int M_col = M-7; // M�� 
		
		for(int i=0; i<N_row; i++) {
			for(int j=0; j<M_col; j++) {
				find(i, j);
			}
		}
		System.out.print(min);
	}

	private static void find(int x, int y) {
		int end_x = x + 8;
		int end_y = y + 8;
		int count = 0;
		
		boolean TF = arr[x][y]; // ù��° ĭ�� �� (T Ȥ�� F)
		
		for(int i=x; i<end_x; i++) {
			for(int j=y; j<end_y; j++) {
				
				// �ùٸ� ���� �ƴѰ�� count 1����
				if(arr[i][j] != TF) {
					count++;
				}
				
				TF = (!TF); // ���� ĭ�� ���� �ٲ�Ƿ� ������ ���� ����
			}
			TF = !TF;
		}
		
		// ù ��° ĭ�� �������� �� ���� ��ĥ �� ������ (count) 
		// ù ��° ĭ�� ���� �ݴ�Ǵ� ���� �������� �� ���� ��ĥ �� ����(64-count) �� �ּڰ��� count�� ����
		count = Math.min(count, 64 - count); 
		
		// ���������� ��� �� �ּڰ����� ���� count ���� �� ���� ��� �ּڰ��� ����
		min = Math.min(min, count);
	}

}
