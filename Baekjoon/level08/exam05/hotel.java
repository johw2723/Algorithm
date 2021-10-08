package level08.exam05;

import java.util.Scanner;

public class hotel {
	
	// ���� : https://www.acmicpc.net/problem/10250

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt(); // �׽�Ʈ ���̽��� ��
		
		for(int i=0; i<T; i++) {
			int H = sc.nextInt(); // ȣ���� �� ��
			int W = sc.nextInt(); // �� ���� �� ��
			int N = sc.nextInt(); // �� ��° �մ�
			
			// 2 3 5 : 101 201 / 102 202 / 103 203
			// 6 12 10 : 101 201 301 401 501 601 / 102 202 302 [402] 502 602 
			// 6 12 15 : 101 201 301 401 501 601 / 102 202 302 402 502 602 / 103 203 [303] 403 503 603 
			
			// Y �� : N % H , ���� N % H = 0 �� �� Y=H
			// X �� :(N / H) + 1 :: X�� 1���� ����, ���� N % H = 0 �� �� X = (N / H)
			
			if(N % H == 0) { // H ���� �����޴� �� ��
				System.out.println((H*100) + (N / H));
			}
			
			else {
				System.out.println((N % H)*100 + (N / H)+1);
			}
			
			
		}
		sc.close();

	}

}
