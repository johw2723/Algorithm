package level09.exam01;

import java.util.Scanner;

public class primeNumber2 {
	
	// ���� : https://www.acmicpc.net/problem/1978

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		
		int count = 0;
		
		for(int i=0; i<N; i++) {
			if(is_prime(sc.nextInt()) == true) {
				count++;
			}
		}
		
		sc.close();
		System.out.print(count);
	}

	private static boolean is_prime(int num) {
		if(num < 2) {
			return false;
		}
		
		if(num == 2) {
			return true;
		}
		
		// ������ �Լ� : Math.sqrt() ��� : �Ҽ��� 1�� �ڱ��ڽŸ���'���'�� ������ ��
		// number-1 ������ �ƴ� number�� ������ ������ �˻� 
		// �ռ��� number = A*B ���� A�� B �� ��� �ϳ��� Number �� �����ٺ��� �۰ų� ����.
		// A, B > sqrt(number) // A * B > number // A * B = Number ��� ���� ���
		for(int i=2; i<= Math.sqrt(num); i++) {
			
			// �Ҽ��� �ƴҰ��
			if(num % i == 0) {
				return false;
			} 
		}

		// �� �ݺ������� ����� ������ ���� �ʴ� ��� 
		return true;
	}

}
