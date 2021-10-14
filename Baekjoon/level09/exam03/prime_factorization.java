package level09.exam03;

import java.util.Scanner;

public class prime_factorization {
	
	// ���� : https://www.acmicpc.net/problem/11653

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		sc.close();
		
		StringBuilder sb = new StringBuilder();
		
		/*
		 * ������ ���� N�� ���Ͽ� �������� �����ϸ� �������� �������� ��Ī�� �ȴ�.		
		 * ex) 9 = 1*9, 3*3, 9*1
		 * ��, i * i �� N ������ �� ������ Ž���ص� �ȴ�.
		 */
		
		for(int i=2; i*i<=N; i++) {
			while(N%i == 0) {
				sb.append(i).append('\n');
				N /= i;
			}
		}
		
		/*
		 * ��� �����ٱ����� Ž���ϸ� �������� �߻��� �� �ִ�.
		 * �� �������� 1 �Ǵ� �Ҽ��̰� �ݵ�� 1������ ����ȴ�.
		 * ���� 6�� ��� 2�� ���������, 3�� ���� for������ �ɷ����� �ʴ´�.
		 * �̷� ��쿡 ���� 1�� �ƴ� ��쿡�� �� �� �� �߰����־�� �Ѵ�. 
		 * �ٸ� ��쵵 1������ ����Ǵ� ������, �ش� �Ҽ��� N�� ������ ���� ũ�ٴ� �ǹ̰�
		 * �� �Ҽ��� ������ ���� N�� �����ٺ��� �׻� �۱� ������ 
		 * ���� �� ���� �ռ� for������ �̹� �ɸ����� �ȴ�. �׸��� �������� ������ �Ҽ��� �ȴ�.
		 */
		
		if(N!=1) {
			sb.append(N);
		}
		
		System.out.print(sb);

	}

}
