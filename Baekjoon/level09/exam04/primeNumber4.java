package level09.exam04;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class primeNumber4 {
	
	// ���� : https://www.acmicpc.net/problem/1929

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));		
		StringTokenizer token = new StringTokenizer(br.readLine()," ");
		br.close();
		
		int M = Integer.parseInt(token.nextToken());
		int N = Integer.parseInt(token.nextToken());
		
		StringBuilder sb = new StringBuilder();
		boolean[] prime = new boolean[N+1];
		
		/*
		 * �Ҽ� �迭, �˻縦 �������� �ʰ� �Ǻ��� ���ÿ� ���
		 * �� �� ����� Math.sqrt(), �� �ִ��� �����ٱ����� ��ȸ�ϴ� ���� �ƴ϶� 
		 * �ִ񰪱��� ��� ��ȸ�ؾ� �����ϴ�.
		 * ����, ���� �ݺ����� ���� �ݺ����� int j=i*i�� �� ��� �Է� �ִ��� 1,000,000 �̶�
		 * i �� �ִ� 1,000,000�� �ȴٸ� j�� ��� 1,000,000,000,000 ���� int�� ������ �Ѿ���� �� �ִ�.
		 * �׷��� int j = i+i�� �����Ͽ� Ǯ��� �Ѵ�.
		 */

		for(int i=2; i<=N; i++) {
			if(prime[i]) continue;
			
			if(i>=M) sb.append(i).append('\n');
			
			for(int j=i+i; j<=N; j+=i) { // i*i�� ��� j�� int�� ������ �Ѿ���� �� �ִ�. ������ length �� �ƴ϶� N�� �����ϰ� ����
				prime[j] = true;
			}
		}
		
		System.out.print(sb);

	}

}
