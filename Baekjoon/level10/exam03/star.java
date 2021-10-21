package level10.exam03;

import java.util.Scanner;

public class star {
	
	// ���� : https://www.acmicpc.net/problem/2447
	
	static char[][] arr;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt(); // N�� 3�� �ŵ�����
		sc.close();
		
		/* 
		 * *** 
		 * * * arr[1][1] 
		 * *** 
		 */
		
		/* 
		 * *********   
		 * * ** ** * arr[1][1], arr[1][4], arr[1][7]  
		 * ********* 
		 * ***   *** arr[3][3], arr[3][4], arr[3][5]
		 * * *   * * arr[4][1], arr[4][3], arr[4][4], arr[4][5], arr[4][7]
		 * ***   *** arr[5][3], arr[5][4], arr[5][5]
		 * *********
		 * * ** ** * arr[7][1], arr[7][4], arr[7][7]  
		 * *********
		 */
		
		arr = new char[N][N];
		star(0, 0, N, false); // x, y, N, boolean
		
		StringBuilder sb = new StringBuilder();
		for(int i=0; i<N; i++) {
			for(int j=0; j<N; j++) {
				sb.append(arr[i][j]);
			}
			sb.append('\n');
		}
		System.out.print(sb);
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
