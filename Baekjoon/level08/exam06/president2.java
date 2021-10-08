package level08.exam06;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class president2 {
	
	// ���� : https://www.acmicpc.net/problem/2775

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine()); // �׽�Ʈ ���̽��� ��
		
		// ���� : a�� bȣ : (a-1)��  1~bȣ ���� ������� ���� ��
		// ����ִ� �� ����, ����Ʈ 0������ ����, ������ 1ȣ���� ����, 0���� iȣ���� i���� ���.
		// 1 �� k, n �� 14
		
		for(int i=0; i<T; i++) {
			
			int h = Integer.parseInt(br.readLine()); // ��
			int w = Integer.parseInt(br.readLine()); // ȣ
			
			// h �� n ȣ = (h-1)�� 1ȣ + ... (h-1)�� wȣ
			
			/* i�� 1ȣ
			 * 1  4 10 20 35 56 84 120
			 * 1  3  6 10 15 21 28 36 
			 * 1  2  3  4  5  6  7  8 : 0�� nȣ
			 */
			int[][] APT = new int[15][15];
			
			for(int j=1; j<15; j++) {
				APT[j][1] = 1; // i �� 1ȣ
				APT[0][j] = j; // 0�� iȣ
			}
			
			for(int j=1; j<15; j++) {
				for(int k=2; k<15; k++) {
					APT[j][k] = APT[j][k - 1] + APT[j - 1][k];
				}
			}
			
			System.out.println(APT[h][w]);

		}

	}

}
