package level14.exam01;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class fibonacci4 {
	
	// 출저 : https://www.acmicpc.net/problem/1003
	// 반복문 풀이
	public static int zero;
	public static int one;
	public static int zero_plus_one;
	public static StringBuilder sb = new StringBuilder();
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int T = Integer.parseInt(br.readLine());
		
		for(int i=0; i<T; i++) {
			int N = Integer.parseInt(br.readLine());
			fibonacci(N);
			sb.append(zero).append(' ').append(one).append('\n');
		}
		
		br.close();
		System.out.print(sb);
		
	}

	private static void fibonacci(int N) {
		// 초기화가 반드시 필요하다.
		zero = 1;
		one = 0;
		zero_plus_one = 1;
		
		for(int i=0; i<N; i++) {
			zero = one;
			one = zero_plus_one;
			zero_plus_one = zero + one;
		}
	}

}
