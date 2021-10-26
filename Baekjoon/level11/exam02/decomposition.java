package level11.exam02;

import java.util.Scanner;

public class decomposition {

	// ���� : https://www.acmicpc.net/problem/2231
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		sc.close();
		
		int answer = 0;
		
		for(int i=0; i<N; i++) {
			int number = i;
			int sum = 0; 
			
			while(number != 0) {
				sum += number % 10; // �� �ڸ��� ���ϱ�
				number /= 10;
			}
			
			// i ���� �� �ڸ��� �������� ���� �� (�����ڸ� ã���� ��)
			if(sum + i == N) {
				answer = i;
				break;
			}
		}
		
		System.out.print(answer);

	}

}
