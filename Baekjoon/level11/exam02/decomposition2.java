package level11.exam02;

import java.util.Scanner;

public class decomposition2 {

	// ���� : https://www.acmicpc.net/problem/2231
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		// �� �ڸ��� ���� �˱� ���� ���ڿ��� �Է� �� �ޱ�
		String str_N = sc.nextLine();
		sc.close();
		
		// ���� ����
		int N_length = str_N.length();
		int N = Integer.parseInt(str_N);		
		int answer = 0;
		
		for(int i=(N-(N_length*9)); i<N; i++) {
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
