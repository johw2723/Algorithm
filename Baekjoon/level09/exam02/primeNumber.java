package level09.exam02;

import java.util.Scanner;

public class primeNumber {

	// 출저 : https://www.acmicpc.net/problem/2581
	public static boolean prime[];
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int M = sc.nextInt();
		int N = sc.nextInt();
		sc.close();
		
		prime = new boolean[N + 1]; // 배열 생성
		get_prime();
		
		// 소수 합 및 최솟값
		int sum = 0;
		int min = Integer.MAX_VALUE;
		for(int i=M; i<=N; i++) {
			if(prime[i] == false) { // 소수일 때
				sum += i;
				if(min == Integer.MAX_VALUE) { // 첫 소수가 최솟값
					min = i;
				}
			}
		}
		
		if(sum == 0) { // 소수가 없다면
			System.out.println(-1);
		}
		else {
			System.out.println(sum);
			System.out.println(min);
		}

	}

	// 소수구하기 : 에라토스테네스 체 알고리즘 
	private static void get_prime() {
		prime[0] = true;
		prime[1] = true;
		
		for(int i=2; i<=Math.sqrt(prime.length); i++) {
			for(int j=i*i; j<prime.length; j+=i) {
				prime[j] = true;
			}
		}
		
	}

}
