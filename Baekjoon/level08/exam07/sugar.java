package level08.exam07;

import java.util.Scanner;

public class sugar {
	
	// 출저 : https://www.acmicpc.net/problem/2839

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		sc.close();
		
		/* N : 3x + 5y = answer
		 * 3 : 1 + 0 = 1 
		 * [4 : 1 ... 1 = -1]
		 * 5 : 0 + 1 = 1
		 * 6 : 2 + 0 = 2
		 * [7 : 2 ... 1 = -1]
		 * 8 : 1 + 1 = 2
		 * 9 : 3 + 0 = 3
		 * 10 : 0 + 2 = 2
		 * 11 : 2 + 1 = 3
		 * 12 : 4 + 0 = 4
		 * 13 : 1 + 2 = 3
		 * 14 : 3 + 1 = 4
		 * 15 : 0 + 3 = 3
		 * 16 : 2 + 2 = 4
		 * 17 : 4 + 1 = 5
		 * 18 : 1 + 3 = 4
		 * 19 : 3 + 2 = 5
		 * 20 : 0 + 4 = 4
		 * 21 : 2 + 3 = 5
		 * 22 : 4 + 2 = 6
		 * 23 : 1 + 4 = 5
		 * 24 : 3 + 3 = 6
		 */
		 
		// 3 6 9 12 : 3의 배수
		// 4 7 : -1
		// 5 10 15 20 : 5의 배수  :: N/5
		// (3) 8 13 18 23 : 5의 배수 + 3 :: N/5 + 1  0 + 1 / 1 + 1 / 2 + 1
		// (6) 11 16 21 : 5의 배수 + 1 :: N/5 + 1    0 + 2 / 1 + 2 / 2 + 2
		// (9) 14 19 24 : 5의 배수 + 4 :: N/5 + 2    0 + 3 / 1 + 3 / 2 + 3 
		// (12) 17 22 : 5의 배수 + 2 :: N/5 + 2      0 + 4 / 1 + 4 / 2 + 4
		
		if(N == 4 || N == 7){
			System.out.print(-1);
		} 
		
		else if(N%5 == 0){
			System.out.print(N/5);
		}
		
		else if(N%5 == 3) {
			System.out.print(((N-3)/5) + 1);
		} 
		
		else if(N%5 == 1) {		
			System.out.print(((N-6)/5) + 2);
		} 
		
		else if(N%5 == 4) {
			System.out.print(((N-9)/5) + 3);
		}
		
		else if(N%5 == 2) {
			System.out.print(((N-12)/5) + 4);
		}

	}

}
