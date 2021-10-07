package level08.exam04;

import java.util.Scanner;

public class rise {

	// √‚¿˙ : https://www.acmicpc.net/problem/2869
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int A = sc.nextInt();
		int B = sc.nextInt();
		int V = sc.nextInt();
		sc.close();
		
		// 5 = 2*(n) - 1(n-1)
		// 5 = 2n - n + 1
		// 4 = n
		
		int n = 0;
		
		while(true) {
			if(V <= (A*n)-(B*(n-1))) {
				System.out.print(n);
				break;
			} else {
				n++;
			}
		}

	}

}
