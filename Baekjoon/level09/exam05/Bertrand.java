package level09.exam05;

import java.util.Scanner;

public class Bertrand {
	
	// 출저 : https://www.acmicpc.net/problem/4948
	
	public static boolean[] prime;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			int min = sc.nextInt();
			int max = 2 * min;
			int count = 0;
			
			if(min==0) break;
			
			prime = new boolean[max + 1];
			get_prime();
			
			for(int i=min+1; i<=max; i++) {
				// false = 소수
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
