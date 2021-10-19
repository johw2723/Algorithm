package level09.exam05;

import java.util.Scanner;

public class Bertrand2 {
	
	// ���� : https://www.acmicpc.net/problem/4948
	
	public static boolean[] prime = new boolean[246913];
	/*
	 * n > 123456 �̹Ƿ� 2n�� �ִ� 246912 �̴�.
	 * 0 ���� �����ϹǷ� �迭�� +1 
	 */

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		// �Ҽ� ���
		get_prime();
		
		// �Ҽ� ī��Ʈ�ϱ�
		while(true) {
			int N = sc.nextInt();
			if(N==0) break;
			
			int count = 0;
			
			for(int i=N+1; i<=2*N; i++) {
				if(!prime[i]) count++;
			}
			
			System.out.println(count);
		}
		
		sc.close();
		

	}

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