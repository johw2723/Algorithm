package level09.exam06;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Goldbach2 {
	
	// ���� : https://www.acmicpc.net/problem/9020
	
	public static boolean[] prime = new boolean[10001];

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		get_prime();
		
		int T = Integer.parseInt(br.readLine());
		
		for(int i=0; i<T; i++) {
			int N = Integer.parseInt(br.readLine());
			
			// N = p + q (p�� q�� �Ҽ�) �� ��, p�� 1�� ���ҽ�Ű�� q�� 1�� ������Ű�� �Ҽ��� ã��
			int p = N/2;
			int q = N/2;
			
			while(true) {
				if(!prime[p] && !prime[q]) {
					System.out.println(p + " " + q);
					break;
				}
				p--;
				q++;
			}
		
		}

	}

	// �����佺�׳׽��� ü �˰���
	private static void get_prime() {
		prime[0] = prime[1];
		
		for(int i=2; i<=Math.sqrt(prime.length); i++) {
			if(prime[i]) continue;
			for(int j=i*i; j<prime.length; j+=i) {
				prime[j] = true;
			}
		}
	}
}
