package level09.exam06;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Goldbach2 {
	
	// 출저 : https://www.acmicpc.net/problem/9020
	
	public static boolean[] prime = new boolean[10001];

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		get_prime();
		
		int T = Integer.parseInt(br.readLine());
		
		for(int i=0; i<T; i++) {
			int N = Integer.parseInt(br.readLine());
			
			// N = p + q (p와 q가 소수) 일 때, p는 1씩 감소시키고 q는 1씩 증가시키며 소수를 찾음
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

	// 에라토스테네스의 체 알고리즘
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
