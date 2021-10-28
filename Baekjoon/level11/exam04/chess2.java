package level11.exam04;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class chess2 {
	
	// ���� : https://www.acmicpc.net/problem/1018
	
	public static boolean[][] arr;
	public static int min = 64; // 8*8 �� �ּ�

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer token = new StringTokenizer(br.readLine()," ");
		int N = Integer.parseInt(token.nextToken());
		int M = Integer.parseInt(token.nextToken());
		
		arr = new boolean[N][M];
		
		// �迭 �Է�
		for(int i=0; i<N; i++) {
			String str = br.readLine();
			
			for(int j=0; j<M; j++) {
				if(str.charAt(j)=='W') {	
					arr[i][j] = true; // W�� �� true
				}
				else {
					arr[i][j] = false; // B�� �� false
				}
			}
		}
		br.close();
		
		// �ּ� ũ�Ⱑ 8*8 �� �� ����� ���� 1���̱� ������ �� ��Ŀ� -7�� ���ش�.
		
		for(int i=0; i<N-7; i++) {
			for(int j=0; j<M-7; j++) {
				find(i, j);
			}
		}
		
		System.out.println(min);
		
	}

	private static void find(int x, int y) {
		
		int count = 0;
			
		boolean TF = arr[x][y]; // ù ��° ĭ�� ���� Ȯ���Ѵ�. W�� T / B �� F
		
		for(int i=x; i<x+8; i++) {
			for(int j=y; j<y+8; j++) {
				
				// �ùٸ� ���� �ƴ� ��� count 1 ����
				if(arr[i][j] != TF) {
					count++;
				}
				
				TF = (!TF); // ���� ĭ�� ���� �ٲ�Ƿ� ������ ���� ����
			}
			TF = !TF;
		}
		
		// ù ��° ĭ�� �������� �� ���� ��ĥ�� ������ �ݴ�Ǵ� ���� �������� �� ���� ��ĥ�� ���� �� �ּڰ��� ����
		count = Math.min(count, 64 - count); 
		
		// ���������� ��� �� �ּڰ����� ���� count ���� �� ���� ��� min�� ����
		min = Math.min(min, count);
		
	}
}
