package level09.exam04;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class primeNumber3 {
	
	// 출저 : https://www.acmicpc.net/problem/1929
	
	public static boolean[] prime;

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));		
		StringTokenizer token = new StringTokenizer(br.readLine()," ");
		br.close();
		
		int M = Integer.parseInt(token.nextToken());
		int N = Integer.parseInt(token.nextToken());
		
		prime = new boolean[N+1];
		get_prime();
		
		StringBuilder sb = new StringBuilder();
		
		for(int i=M; i<=N; i++) {
			if(!prime[i]) sb.append(i).append('\n'); 
		}
		
		System.out.print(sb);

	}

	// 에라토스테네스의 체 알고리즘
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
