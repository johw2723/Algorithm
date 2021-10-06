package level08.exam01;

import java.util.Scanner;

public class BEP {
	
	// ���� : https://www.acmicpc.net/problem/1712

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int A = sc.nextInt(); // �������
		int B = sc.nextInt(); // �������
		int C = sc.nextInt(); // ��ǰ����
		sc.close();
		
		if(B>=C) {
			System.out.print(-1);
		} else {
			// n*C = A + (n*B)
			// nC - nB = A
			// n(C-B) = A
			// n = A(C-B)
			System.out.print((A/(C-B))+1); // +1 : ������ �߻��ϴ� ���� 
		}
	}

}
