package level09.exam05;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Bertrand5 {
	
	// ���� : https://www.acmicpc.net/problem/4948
	
	/*
	 * n > 123456 �̹Ƿ� 2n�� �ִ� 246912 �̴�.
	 * 0 ���� �����ϹǷ� �迭�� +1 
	 */
	public static boolean[] prime = new boolean[246913];
	
	// 1���� �����Ͽ� �� index ������ �Ҽ��� ������ ���� �迭
	public static int[] count_arr = new int[246913];


	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		get_prime();
		get_count();
		
		while(true) {
			int N = Integer.parseInt(br.readLine());
			if(N==0) break;
			
			// 2N ������ �Ҽ��� ���� - N ������ �Ҽ��� ����
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
			 *  0 ~ i ���� �Ҽ��� ���� = count
			 *  count ���� �迭�� i�� �����Ѵ�
			 */
			count_arr[i] = count;
		}
		
	}

}
