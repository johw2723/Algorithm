package level11.exam03;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class bulk3 {
	
	// ���� : https://www.acmicpc.net/problem/7568

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine()); // ��ü ��� ��
		
		int[][] arr = new int[N][2]; // ���� �Է¹��� ���� ����
		String[] str;
		
		// �Է�
		for(int i=0; i<N; i++) {
			str = br.readLine().split(" ");
			arr[i][0] = Integer.parseInt(str[0]); // ������
			arr[i][1] = Integer.parseInt(str[1]); // Ű
		}
		
		StringBuilder sb = new StringBuilder();
		
		for(int i=0; i<N; i++) {
			int rank = 1; // ����� 1����� �����Ѵ�.
			
			for(int j=0; j<N; j++) {
				if(i == j) continue; // ���� ����� ������ �ʴ´�.
				
				if(arr[i][0] < arr[j][0] && arr[i][1] < arr[j][1]) {
					rank++; // i��° ����� j ��° ����� ���ؼ� i�� j���� ��ġ�� ���� ��� ����� �ø���
				}
			}
			
			sb.append(rank).append(" ");
		}
		
		System.out.println(sb);
	}

}
