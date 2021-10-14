package level09.exam03;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class prime_factorization2 {
	
	// ���� : https://www.acmicpc.net/problem/11653

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		br.close();
		
		StringBuilder sb = new StringBuilder();
		
		
		
		/*
		 * ������ ���� N�� ���Ͽ� �������� �����ϸ� �������� �������� ��Ī�� �ȴ�.		
		 * ex) 9 = 1*9, 3*3, 9*1
		 * ��, i * i �� N ������ �� ������ Ž���ص� �ȴ�.
		 */
		
		for(int i=2; i*i<=N; i++) {
			while(N%i==0) {
				sb.append(i).append('\n');
				N /= i;
			}
		}
		

		/*
		 * ��� �����ٱ����� Ž���ϸ� �������� �߻��� �� �ִ�.
		 * �� �������� 1 �Ǵ� �Ҽ��̰� �ݵ�� 1������ ����ȴ�.
		 * ���� 6�� ��� 2�� ���������, 3�� ���� for������ �ɷ����� �ʴ´�.
		 * �̷� ��쿡 ���� 1�� �ƴ� ��쿡�� �� �� �� �߰����־�� �Ѵ�. 
		 * �ٸ� ��쵵 1������ ����Ǵ� ������, �ش� �Ҽ��� N�� ������ ���� ũ�ٴ� �ǹ̰�
		 * �� �Ҽ��� ������ ���� N�� �����ٺ��� �׻� �۱� ������ 
		 * ���� �� ���� �ռ� for������ �̹� �ɸ����� �ȴ�. �׸��� �������� ������ �Ҽ��� �ȴ�.
		 */
		
		if(N!=1) {
			sb.append(N);
		}
		
		System.out.print(sb);

	}

}
