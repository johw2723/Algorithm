package level14.exam08;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class makeOne3 {

	// ���� : https://www.acmicpc.net/problem/1463
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		br.close();
		
		System.out.println(make(N, 0));

	}

	private static int make(int N, int count) {
		// N�� 2�̸��� ��� ������ count ���� ��ȯ
		if(N < 2) {
			return count;
		}
		// DP�� �������ָ鼭 �̸����̼��� �ϴ� ��� : N-1, �� 1�� �� ���� ���ȣ���� �ؾ���
		// ������ ���� �̿��Ͽ� count�� �������ִ� ��� 
		// N�� ���� 2�� 3���� ������ count�� +1�� �� ������ ������ ���� ������ ���� �ȴ�. (������ ���� ���� 1�� ���� ���� count ���� ���� ����)
		return Math.min(make(N/2, count + 1 + (N%2)), make(N/3, count + 1 + (N%3)));
	}

}
