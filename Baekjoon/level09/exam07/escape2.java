package level09.exam07;

import java.util.Scanner;

public class escape2 {
	
	// ���� : https://www.acmicpc.net/problem/1085

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		int y = sc.nextInt();
		int w = sc.nextInt();
		int h = sc.nextInt();
		sc.close();
		
		// Math.min() : �Է¹��� �ΰ��� �� �� ���� ���� ����
		int x_min = Math.min(x, w-x); // x�� �ּҰŸ�
		int y_min = Math.min(y, h-y); // y�� �ּҰŸ�
		
		// �䱸���� : x�� y�� �� �ּҰŸ�
		System.out.print(Math.min(x_min, y_min));

	}

}
