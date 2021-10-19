package level09.exam10;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class geometry2 {
	
	// ���� : https://www.acmicpc.net/problem/3053

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		double R = Integer.parseInt(br.readLine());
		br.close();
		
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
