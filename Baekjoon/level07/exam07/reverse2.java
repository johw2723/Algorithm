package level07.exam07;

import java.util.Scanner;

public class reverse2 {
	
	// 출저 : https://www.acmicpc.net/problem/2908

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int A = sc.nextInt();
		int B = sc.nextInt();
		sc.close();
		
		// StringBuilder() : 문자열을 다루는 클래스로 주로 사용하며 reverse() 메소드를 포함한다.
		A = Integer.parseInt(new StringBuilder().append(A).reverse().toString());
		B = Integer.parseInt(new StringBuilder().append(B).reverse().toString());
		
		System.out.print(A > B ? A : B); // 삼항연산자 사용으로 코드 줄이기

	}

}
