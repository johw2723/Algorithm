package level08.exam01;

import java.util.Scanner;

public class BEP {
	
	// 출저 : https://www.acmicpc.net/problem/1712

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int A = sc.nextInt(); // 고정비용
		int B = sc.nextInt(); // 가변비용
		int C = sc.nextInt(); // 상품가격
		sc.close();
		
		if(B>=C) {
			System.out.print(-1);
		} else {
			// n*C = A + (n*B)
			// nC - nB = A
			// n(C-B) = A
			// n = A(C-B)
			System.out.print((A/(C-B))+1); // +1 : 이익이 발생하는 지점 
		}
	}

}
