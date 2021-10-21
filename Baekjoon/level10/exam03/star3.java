package level10.exam03;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class star3 {
	
	// ���� : https://www.acmicpc.net/problem/2447
	
	static StringBuilder[] sb;

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine()); // N�� 3�� �ŵ�����
		br.close();
		
		sb = new StringBuilder[N];
		// String.format �� �̿��Ͽ� ���鹮�ڸ� N���̸�ŭ �����, ������� ���ڿ��� StringBuilder�� ����
		String s = String.format("%" + N + "s", ' ');
		for(int i=0; i<N; i++) {
			sb[i] = new StringBuilder(s);
		}
		
		// ��� �Լ����� ���� �κ��� �ƴ� �κи� ������ *�� ġȯ
		star(0, 0, N);
		
		for(int i=0; i<N; i++) {
			System.out.println(sb[i]);
		}
		
	}

	private static void star(int x, int y, int N) {	
		// ���̻� �ɰ� �� ���� ����� ��
		if(N == 1) {
			sb[x].setCharAt(y, '*');
			return;
		}
		
		// N = 27 �� ��� �� ����� ������� 9�̰�, N = 9 �� ��� �� ����� ������� 3�̴�	
		int size = N / 3; // �ش� ����� �� ĭ�� ���� ����
		int count = 0; // �� ��� ����
		
		for(int i=x; i<x+N; i+=size) {
			for(int j=y; j<y+N; j+=size) {
				count++;
				if(count != 5) {
					star(i, j, size);
				}
			}
		}
	}

}
