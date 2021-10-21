package level10.exam03;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class star4 {
	
	// ���� : https://www.acmicpc.net/problem/2447
	
	static char[][] arr;

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int N = Integer.parseInt(br.readLine()); // N�� 3�� �ŵ�����
		br.close();
		
		arr = new char[N][N];
		star(0, 0, N, false); // x, y, N, boolean
		
		for(int i=0; i<N; i++) {
			bw.write(arr[i]);
			bw.write("\n");
		}
		bw.flush();
		bw.close();
	}

	// blank�� true ��� ������ �ǹ��Ѵ�.
	private static void star(int x, int y, int N, boolean blank) {
		// ����ĭ�� ���
		if(blank) {
			for(int i=x; i<x+N; i++) {
				for(int j=y; j<y+N; j++) {
					arr[i][j] = ' ';
				}
			}
			return;
		}
		
		// ���̻� �ɰ� �� ���� ����� ��
		if(N == 1) {
			arr[x][y] = '*';
			return;
		}
		
		// N = 27 �� ��� �� ����� ������� 9�̰�, N = 9 �� ��� �� ����� ������� 3�̴�	
		int size = N / 3; // �ش� ����� �� ĭ�� ���� ����
		int count = 0; // �� ��� ����
		
		for(int i=x; i<x+N; i+=size) {
			for(int j=y; j<y+N; j+=size) {
				count++;
				if(count == 5) { // ���� ĭ�� ���
					star(i, j, size, true);
				}
				else {
					star(i, j, size, false);
				}
			}
		}
	}

}
