package level10.exam02;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Fibonacci4 {
	
	// √‚¿˙ : https://www.acmicpc.net/problem/10870

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		br.close();
		
		System.out.print(fibonacci(N));

	}

	private static int fibonacci(int N) {
		if(N == 0) return 0;
		if(N == 1) return 1;
		return fibonacci(N - 1) + fibonacci(N - 2);
	}

}
