package level08.exam03;

import java.util.Scanner;

public class search {
	
	// ���� : https://www.acmicpc.net/problem/1193

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int X = sc.nextInt();
		sc.close();
		
		/*
		 * 1/1 : A case = ������ Ȧ��, �и�>=���� ����, �����
		 * 1/2 2/1 : B case = ������ ¦��, ����>�и� ����, ������
		 * 3/1 2/2 1/3 : A
		 * 1/4 2/3 3/2 4/1 : B
		 * 5/1 4/2 3/3 2/4 1/5 : A 
		 */
		
		int count = 1; // �밢���� ���� (Ȧ��, ¦�� ����)
		int sum = 0; // �ش� �밢������ ĭ�� ������ 
		
		while(true) {
			
			// ���� �Ǻ� 
			if(X <= count + sum) {
				if(count % 2 == 1) { // �밢���� ������ Ȧ�� = ���ڰ� ū ������ ����
					// ���� : �밢�� ���� - (X��° - ���� �밢�������� ������ -1)
					// �и� : X��° - ���� �밢������ ĭ�� ������
					System.out.print((count - (X - sum - 1)) + "/" + (X - sum));
					break;
				}
				
				else { // �밢���� ������ ¦�� = �и� ū ������ ���� (��� �ݴ�)
					System.out.print((X - sum) + "/" + (count - (X - sum -1)));
					break;
				}
			} else { // �밢���� ������ �밢������ ĭ�� �������� X���� ���� �� 
				sum += count; // 1��° ������ 1ĭ, 2��° ������ 1ĭ + 2ĭ, 3��° ������ 1 + 2+ 3ĭ 
				count++;
				
				/* ex : X = 3
				 * sequence 1 :: 3 <= (1 + 0) : false / 0 += 1 : sum = 1, count = 2  
				 * sequence 2 :: 3 <= (2 + 1) : true 
				 *             : if ( 2 % 2 == 1 ) : false
				 *             : (3 - 1) / (2 - (3 - 1 - 1)) = 2 / 1
				 */
			}
		}

	}

}
