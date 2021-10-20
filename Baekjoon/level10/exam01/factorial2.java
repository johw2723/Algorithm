package level10.exam01;

import java.util.Scanner;

public class factorial2 {
	
	// 출저 : https://www.acmicpc.net/problem/10872

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		sc.close();
		
		int cal = factorial(N);
		System.out.println(cal);

	}

	private static int factorial(int N) {
		if(N == 0) return 1; // 재귀 종료조건
		return N * factorial(N - 1);
	}

}
