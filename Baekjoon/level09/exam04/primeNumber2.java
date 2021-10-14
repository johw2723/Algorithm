package level09.exam04;

import java.util.Scanner;

public class primeNumber2 {
	
	// 출저 : https://www.acmicpc.net/problem/1929
	
	public static boolean[] prime;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int M = sc.nextInt();
		int N = sc.nextInt();
		sc.close();
		
		prime = new boolean[N + 1];
		get_prime();
		
		StringBuilder sb = new StringBuilder();
		
		for(int i=M; i<=N; i++) {
			// false = 소수
			if(!prime[i]) sb.append(i).append('\n');
		}
		
		System.out.print(sb);

	}

	// 에라토스테네스의 체 알고리즘
	private static void get_prime() {
		prime[0] = true;
		prime[1] = true;
		
		for(int i=2; i<=Math.sqrt(prime.length); i++) {
			if(prime[i]) continue;
			for(int j = i*i; j<prime.length; j+=i) {
				prime[j] = true;
			}
		}
	}

}
