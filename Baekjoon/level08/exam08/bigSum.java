package level08.exam08;

import java.util.Scanner;

public class bigSum {
	
	// ���� : https://www.acmicpc.net/problem/10757

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String strA = sc.next();
		String strB = sc.next();
		sc.close();
		
		// �� ���� �� �� ���� �� �ڸ��� ���̸� ���صд�.
		// Math.max : �� ���� ���ؼ� ū ���� �����Ѵ�.
		int max_length = Math.max(strA.length(), strB.length());
		
		// �迭 ���� (������ �ڸ��� �ø��� ���� �� �����Ƿ� 1ĭ�� �� �����Ѵ�)
		int[] A = new int[max_length + 1];
		int[] B = new int[max_length + 1];
		
		// �ʱ�ȭ
		
		for(int i = strA.length() - 1, idx = 0; i >= 0; i--, idx++) {
			A[idx] = strA.charAt(i) - '0'; // �� �� ���ں��� �������� �ϳ��� ����
		}
		
		for(int i = strB.length() - 1, idx = 0; i >= 0; i--, idx++) {
			B[idx] = strB.charAt(i) - '0'; // �� �� ���ں��� �������� �ϳ��� ����
		}
		
		// ���ϱ�
		for(int i=0; i<max_length; i++) {
			int value = A[i] + B[i];
			A[i] = value % 10;  // ���� ���� 10���� ���� �������� �ڸ����� �ȴ�.
			A[i + 1] += (value / 10); // ���� ���� 10���� ���� ���� �ø����� �ȴ�.
		}
		
		// ��� 
		StringBuilder sb = new StringBuilder();
		if(A[max_length] != 0) { // ���� ���� �ڸ����� 0�� ���� �ֱ� ������
			sb.append(A[max_length]);
		}
		
		for(int i = max_length - 1; i>=0; i--) { // �� �� ���ں��� �Է��߱� ������ �������� ����Ѵ�.
			sb.append(A[i]);
		}
		
		System.out.println(sb);

	}

}
