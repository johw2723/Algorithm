package level09.exam01;

import java.util.Scanner;

public class primeNumber {
	
	// √‚¿˙ : https://www.acmicpc.net/problem/1978

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		
		int count = 0;
		
		for(int i=0; i<N; i++) {
			if(is_prime(sc.nextInt()) == true) {
				count++;
			}
		}
		
		sc.close();
		System.out.print(count);
	}

	private static boolean is_prime(int num) {
		if(num < 2) {
			return false;
		}
		
		if(num == 2) {
			return true;
		}
		
		for(int i=2; i<num; i++) {
			if(num % i == 0) {
				return false;
			} 
		}

		return true;
	}

}
