package level09.exam01;

import java.util.Scanner;

public class primeNumber2 {
	
	// 출저 : https://www.acmicpc.net/problem/1978

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
		
		// 제곱근 함수 : Math.sqrt() 사용 : 소수가 1과 자기자신만을'약수'로 가지는 것
		// number-1 까지가 아닌 number의 제곱근 까지만 검사 
		// 합성수 number = A*B 에서 A와 B 중 적어도 하나는 Number 의 제곱근보다 작거나 같다.
		// A, B > sqrt(number) // A * B > number // A * B = Number 라는 식의 모순
		for(int i=2; i<= Math.sqrt(num); i++) {
			
			// 소수가 아닐경우
			if(num % i == 0) {
				return false;
			} 
		}

		// 위 반복문에서 약수를 가지고 있지 않는 경우 
		return true;
	}

}
