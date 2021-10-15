package level09.exam05;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Bertrand3 {
	
	// 출저 : https://www.acmicpc.net/problem/4948
	
	public static boolean[] prime = new boolean[246913];
	/*
	 * n > 123456 이므로 2n은 최대 246912 이다.
	 * 0 부터 시작하므로 배열은 +1 
	 */

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		// 소수 얻기
		get_prime();
		
		// 소수 카운트하기
		while(true) {
			int N = Integer.parseInt(br.readLine());
			if(N==0) break;
			
			int count = 0;
			
			for(int i=N+1; i<=2*N; i++) {
				if(!prime[i]) count++;
			}
			
			System.out.println(count);
		}

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
