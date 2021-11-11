package level12.exam09;

import java.util.Scanner;

public class age6 {
	
	// ���� : https://www.acmicpc.net/problem/10814

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		
		// �ԷµǴ� ������ ���� : 1 ~ 200
		StringBuilder[] p = new StringBuilder[201];
		
		// ��ü�迭�� �ε����� �� StringBuilder ��ü�� �����Ѵ�.
		for(int i=0; i<p.length; i++) {
			p[i] = new StringBuilder();
		}
		
		for(int i=0; i<N; i++) {
			int age = sc.nextInt(); // ����
			String name = sc.next(); // dlfma
			// ī���� ���� : ���̸� index �� �Ͽ� �ش� �迭�� ���̿� �̸��� append() �Ѵ�.
			p[age].append(age).append(' ').append(name).append('\n');
		}
		
		sc.close();
		
		StringBuilder sb = new StringBuilder();
		for(StringBuilder value : p) {
			sb.append(value);
		}
		
		System.out.print(sb);
		
	}

}
