package level07.exam07;

import java.util.Scanner;

public class reverse2 {
	
	// ���� : https://www.acmicpc.net/problem/2908

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int A = sc.nextInt();
		int B = sc.nextInt();
		sc.close();
		
		// StringBuilder() : ���ڿ��� �ٷ�� Ŭ������ �ַ� ����ϸ� reverse() �޼ҵ带 �����Ѵ�.
		A = Integer.parseInt(new StringBuilder().append(A).reverse().toString());
		B = Integer.parseInt(new StringBuilder().append(B).reverse().toString());
		
		System.out.print(A > B ? A : B); // ���׿����� ������� �ڵ� ���̱�

	}

}
