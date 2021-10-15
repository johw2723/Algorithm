package level09.exam05;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Bertrand5 {
	
	// 출저 : https://www.acmicpc.net/problem/4948
	
	/*
	 * n > 123456 이므로 2n은 최대 246912 이다.
	 * 0 부터 시작하므로 배열은 +1 
	 */
	public static boolean[] prime = new boolean[246913];
	
	// 1부터 누적하여 각 index 까지의 소수의 개수를 담을 배열
	public static int[] count_arr = new int[246913];


	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		get_prime();
		get_count();
		
		while(true) {
			int N = Integer.parseInt(br.readLine());
			if(N==0) break;
			
			// 2N 까지의 소수의 개수 - N 까지의 소수의 개수
			sb.append(count_arr[2*N] - count_arr[N]).append('\n');
		}		
		System.out.print(sb);
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
	
	private static void get_count() {
		int count = 0;
		for(int i=2; i<prime.length; i++) {
			if(!prime[i]) count++;
			
			/*
			 *  0 ~ i 까지 소수의 개수 = count
			 *  count 값을 배열의 i에 저장한다
			 */
			count_arr[i] = count;
		}
		
	}

}
