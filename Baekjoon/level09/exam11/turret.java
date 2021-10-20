package level09.exam11;

import java.util.Scanner;

public class turret {
	
	// ���� : https://www.acmicpc.net/problem/1002
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		
		for(int i=0; i<T; i++) {
			int x1 = sc.nextInt();
			int y1 = sc.nextInt();
			int r1 = sc.nextInt();
			
			int x2 = sc.nextInt();
			int y2 = sc.nextInt();
			int r2 = sc.nextInt();
			
			// �� ���� �߽��� ����, �������� ���� �� : ������ ������ ���� (x1 = x2, y1= y2, r1 = r2)
			// ������ ���� ��, �� �� ������ �Ÿ��� �� ���� �������� �պ��� ū ��� (x2 - x1)�� + (y2 - y1)�� > (r1 + r2)��
			// ������ ���� ��, �� �� �ȿ� �ٸ����� �����鼭 ������ ���� ��� (x2 - x1)�� + (y2 - y1)�� < (r2 - r1)�� 
			// ������ �Ѱ��� ��, ������ �� (x2 - x1)�� + (y2 - y1)�� = (r2 - r1)�� 
			// ������ �Ѱ��� ��, ������ �� (x2 - x1)�� + (y2 - y1)�� = (r2 + r1)�� 
			// �ܴ̿� ������ �ΰ�
			
			// Math.pow(value1, value2) : ������ ����ϴ� �Լ� value1�� value2 ����
			int distance_pow = (int)(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2)); // ������ �Ÿ��� ���� 
			
			// �߽��� �����鼭 �������� ���� ���
			if(x1 == x2 && y1 == y2 && r1 == r2) {
				System.out.println(-1);
			}
			
			// �� �� ������ �Ÿ��� �� ���� �������� �պ��� ū ���
			else if(distance_pow > Math.pow(r2 + r1, 2)) {
				System.out.println(0);
			}
			
			// �� �� �ȿ� �ٸ����� �����鼭 ������ ���� ���
			else if(distance_pow < Math.pow(r2 - r1, 2)) {
				System.out.println(0);
			}
			
			// ������ ��
			else if(distance_pow == Math.pow(r2 - r1, 2)) {
				System.out.println(1);
			}
			
			// ������ ��
			else if(distance_pow == Math.pow(r2 + r1, 2)) {
				System.out.println(1);
			}
			
			else {
				System.out.println(2);
			}
		}
		sc.close();
	}

}
