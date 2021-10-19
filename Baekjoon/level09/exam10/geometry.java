package level09.exam10;

import java.util.Scanner;

public class geometry {
	
	// ���� : https://www.acmicpc.net/problem/3053

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double R = sc.nextDouble(); // ������ R
		sc.close();
		
		// ��Ŭ���� ������ : D(T��, T��)�� = (x�� - x��)�� + (y�� - y��)�� 
		// �ý� ������  : D(T��, T��) = |x�� - x��| + |y�� - y��|
		
		/*
		 * ���� ���� = PI * r�� I
		 * 
		 * �ý� ������ D = |x| + |y|
		 * ���� ���� (���簢��) = 2r��
		 */
		
		// Math.PI : ������ �� 
		System.out.println(R * R * Math.PI); // ��Ŭ���� ���� ����
		System.out.println(2 * R * R); // �ýñ����� ���� ����

	}

}
