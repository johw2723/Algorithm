package level08.exam06;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class president3 {
	
	// ���� : https://www.acmicpc.net/problem/2775
	
	public static int[][] APT = new int[15][15];

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		fill(); // ����Ʈ ä���
		
		int T = Integer.parseInt(br.readLine()); // �׽�Ʈ ���̽��� ��
		
		for(int i=0; i<T; i++) {
			int h = Integer.parseInt(br.readLine()); // ��
			int w = Integer.parseInt(br.readLine()); // ȣ
			
			sb.append(APT[h][w]).append('\n');
		}
		
		System.out.println(sb);

	}

	private static void fill() {
		// ����Ʈ �� ȣ�� �ο� ä���
		
		for(int i=1; i<15; i++) {
			APT[i][1] = 1; // i �� 1ȣ
			APT[0][i] = i; // 0�� iȣ
		}
		
		for(int i=1; i<15; i++) { // 1 ������ 14������
			for(int j=2; j<15; j++) { // 2ȣ���� 14ȣ����
				APT[i][j] = APT[i][j - 1] + APT[i - 1][j];
			}
		}
	}

}
