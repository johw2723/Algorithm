package level08.exam06;

import java.util.Scanner;

public class president {
	
	// ���� : https://www.acmicpc.net/problem/2775

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt(); // �׽�Ʈ ���̽��� ��
		
		// ���� : a�� bȣ : (a-1)��  1~bȣ ���� ������� ���� ��
		// ����ִ� �� ����, ����Ʈ 0������ ����, ������ 1ȣ���� ����, 0���� iȣ���� i���� ���.
		// 1 �� k, n �� 14
		
		for(int i=0; i<T; i++) {
			
			int h = sc.nextInt(); // ��
			int w = sc.nextInt(); // ȣ
			
			// h �� n ȣ = (h-1)�� 1ȣ + ... (h-1)�� wȣ
			
			/* h�� 1ȣ
			 * 1  4 10 20 35 56 84 120
			 * 1  3  6 10 15 21 28 36 
			 * 1  2  3  4  5  6  7  8 : 0�� nȣ
			 */
			int[][] APT = new int[15][15];
			
			for(int j=1; j<15; j++) {
				APT[j][1] = 1; // j �� 1ȣ
				APT[0][j] = j; // 0�� jȣ
			}
			
			for(int j=1; j<15; j++) {
				for(int k=2; k<15; k++) {
					APT[j][k] = APT[j][k - 1] + APT[j - 1][k];
				}
			}
			
			sc.close();
			System.out.println(APT[h][w]);

		}

	}

}
