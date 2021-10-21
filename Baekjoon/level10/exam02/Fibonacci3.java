package level10.exam02;

import java.util.Scanner;

public class Fibonacci3 {
	
	// 출저 : https://www.acmicpc.net/problem/10870

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		sc.close();
		
		System.out.print(fibonacci(N));

	}

	// 피보나치 함수
	private static int fibonacci(int N) {
		if(N == 0) return 0;
		if(N == 1) return 1;
		return fibonacci(N - 1) + fibonacci(N - 2);

	}

}
