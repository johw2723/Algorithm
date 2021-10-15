package level09.exam06;

import java.util.Scanner;

public class Goldbach {
	
	// ���� : https://www.acmicpc.net/problem/9020
	
	public static boolean[] prime = new boolean[10001];

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt(); // �׽�Ʈ ���̽��� ����
		
		get_prime();
		
		for(int i=0; i<T; i++) {
			int N = sc.nextInt();
			
			/* 
			 * �䱸���� : �� �Ҽ��� ���� ���� ���� ���
			 * n = p + q (p�� q �� �Ҽ�) �� �� p�� q�� �Ҽ��� �ƴ϶�� p�� ���� q�� ������Ű�鼭 ������ �� ���� ã�� �� 
			 */
			
			int p = N/2;
			int q = N/2;
			
			while(true) {
				
				// �� ��Ƽ���� ��� �Ҽ��� ���
				if(!prime[p] && !prime[q]) {
					System.out.println(p + " " + q);
					break;
				}
				p--;
				q++;
			}
		}
		
		sc.close();

	}

	// �����佺�׳׽��� ü �˰���
	private static void get_prime() {
		prime[0] = prime[1] = true;
		
		for(int i=2; i<=Math.sqrt(prime.length); i++) {
			if(prime[i]) continue;
			for(int j=i*i; j<prime.length; j+=i) {
				prime[j] = true;
			}
		}
		
	}

}
