package level10.exam04;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class hanoi4 {
	
	// ���� : https://www.acmicpc.net/problem/11729
	public static StringBuilder sb = new StringBuilder();

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		br.close();
		
		/* 
		 * 1. ���� ū ����(5)�� C�� �ű�� ���ؼ��� n-1���� ����(1~4)�� A���� B�� �����Ѵ� : Hanoi(n-1)
		 * 2. A�� �ִ� ���� ū ����(5)�� C�� �̵� : 1
		 * 3. B�� �ִ� n-1���� ����(1~4)�� C�� �̵� : Hanoi(n-1)
		 * 
		 * ����ȭ
		 * Hanoi(n) = 2 * Hanoi(n-1) + 1 
		 * a(n) = a(n-1) + 1 + a(n-1)
		 * a(n) = 2*a(n-1)+1 
		 * a(1) = 1, a(n+1) = 2a(n)+1
		 * a(n+1) + 1 = 2(a(n) + 1)
		 * b(n) = a(n) + 1 �̶� ������ ��
		 * b(n+1) = 2b(n)
		 * b(1) = a(1) + 1 = 2 
		 * �� ù°���� 2�̰�, ����� 2�� ������� 
		 * b(n) = a(n) + 1 = 2��
		 * �� a(n) = 2��-1
		 */
		
		sb.append((int)Math.pow(2, N) - 1).append('\n'); // Math.pow () : �ŵ������� ���ϴ� �Լ�
		
		Hanoi(N, 1, 2, 3); // ������ ����, �����, �߰�����, ������
		
		System.out.println(sb);
	}

	private static void Hanoi(int N, int start, int mid, int to) {
		/*
		N : ������ ����
		start : �����
		mid : �ű�� ���� �̵��� ���
		to : ������
		*/
		
		// �̵��� ������ ���� 1��
		if(N == 1) {
			sb.append(start + " " + to).append('\n');
			return;
		}
		// 1�ܰ� : N-1���� A���� B�� �̵�
		Hanoi(N-1, start, to, mid);
		
		// 2�ܰ� : 1���� A���� C�� �̵�
		sb.append(start + " " + to).append('\n');
		
		// 3�ܰ� : N-1���� B���� C�� �̵�
		Hanoi(N-1, mid, start, to);
	}

}
