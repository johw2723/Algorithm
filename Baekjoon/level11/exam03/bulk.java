package level11.exam03;

import java.util.Scanner;

public class bulk {
	
	// ���� : https://www.acmicpc.net/problem/7568

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt(); // ��ü ����� ��
		int[][] arr = new int[N][2]; // �����Կ� Ű�� ���� 2���� �迭
		
		// �Է�
		for(int i=0; i<N; i++) {
			arr[i][0] = sc.nextInt(); // ������
			arr[i][1] = sc.nextInt(); // Ű
		}
		
		sc.close();
		
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
