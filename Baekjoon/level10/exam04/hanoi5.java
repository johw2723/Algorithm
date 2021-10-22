package level10.exam04;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class hanoi5 {
	
	// ���� : https://www.acmicpc.net/problem/11729
	public static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

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
		
		bw.write((int)(Math.pow(2, N) - 1) + "\n"); // Math.pow () : �ŵ������� ���ϴ� �Լ�
		
		Hanoi(N, 1, 2, 3); // ������ ����, �����, �߰�����, ������
		
		bw.flush();
		bw.close();
	}

	private static void Hanoi(int N, int start, int mid, int to) throws IOException {
		/*
		N : ������ ����
		start : �����
		mid : �ű�� ���� �̵��� ���
		to : ������
		*/
		
		// �̵��� ������ ���� 1��
		if(N == 1) {
			bw.write(start + " " + to + "\n");
			return;
		}
		// 1�ܰ� : N-1���� A���� B�� �̵�
		Hanoi(N-1, start, to, mid);
		
		// 2�ܰ� : 1���� A���� C�� �̵�
		bw.write(start + " " + to + "\n");
		
		// 3�ܰ� : N-1���� B���� C�� �̵�
		Hanoi(N-1, mid, start, to);
	}

}
