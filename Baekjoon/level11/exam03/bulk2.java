package level11.exam03;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class bulk2 {
	
	// ���� : https://www.acmicpc.net/problem/7568

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine()); // ��ü ��� ��
		
		StringTokenizer token;
		int[][] arr = new int[N][2]; // ���� �Է¹��� ���� ����
		
		// �Է�
		for(int i=0; i<N; i++) {
			token = new StringTokenizer(br.readLine()," ");
			arr[i][0] = Integer.parseInt(token.nextToken()); // ������
			arr[i][1] = Integer.parseInt(token.nextToken()); // Ű
		}
		
		for(int i=0; i<N; i++) {
			int rank = 1; // ����� 1����� �����Ѵ�.
			
			for(int j=0; j<N; j++) {
				if(i == j) continue; // ���� ����� ������ �ʴ´�.
				
				if(arr[i][0] < arr[j][0] && arr[i][1] < arr[j][1]) {
					rank++; // i��° ����� j ��° ����� ���ؼ� i�� j���� ��ġ�� ���� ��� ����� �ø���
				}
			}
			
			System.out.print(rank + " ");
		}
	}

}
