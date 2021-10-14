package level09.exam03;

import java.util.Scanner;

public class prime_factorization {
	
	// 출저 : https://www.acmicpc.net/problem/11653

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		sc.close();
		
		StringBuilder sb = new StringBuilder();
		
		/*
		 * 임의의 정수 N에 대하여 곱셈으로 분해하면 제곱근을 기준으로 대칭이 된다.		
		 * ex) 9 = 1*9, 3*3, 9*1
		 * 즉, i * i 가 N 이하일 때 까지만 탐색해도 된다.
		 */
		
		for(int i=2; i*i<=N; i++) {
			while(N%i == 0) {
				sb.append(i).append('\n');
				N /= i;
			}
		}
		
		/*
		 * 대신 제곱근까지만 탐색하면 나머지가 발생할 수 있다.
		 * 이 나머지는 1 또는 소수이고 반드시 1개임이 보장된다.
		 * 예로 6의 경우 2는 저장되지만, 3은 앞의 for문에서 걸러지지 않는다.
		 * 이런 경우에 대해 1이 아닐 경우에는 한 번 더 추가해주어야 한다. 
		 * 다른 경우도 1개임이 보장되는 이유는, 해당 소수는 N의 제곱근 보다 크다는 의미고
		 * 그 소수로 나눠진 수는 N의 제곱근보다 항상 작기 때문에 
		 * 작은 수 들은 앞선 for문에서 이미 걸리지게 된다. 그리고 나머지는 유일한 소수가 된다.
		 */
		
		if(N!=1) {
			sb.append(N);
		}
		
		System.out.print(sb);

	}

}
