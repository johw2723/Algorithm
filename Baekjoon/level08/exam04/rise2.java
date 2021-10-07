package level08.exam04;

import java.util.Scanner;

public class rise2 {

	// 출저 : https://www.acmicpc.net/problem/2869
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int A = sc.nextInt();
		int B = sc.nextInt();
		int V = sc.nextInt();
		sc.close();
		
		// 5 = 2*(n) - 1(n-1)
		// 5 = 2n - n + 1
		// 4 = n
		// V = An - Bn + B
		// n = (V-B)/(A-B)
		
		int n = (V-B)/(A-B);
		
		if((V-B) % (A - B) != 0) { // 나머지가 있을 경우
			n++;
		}
		System.out.print(n);

	}

}
