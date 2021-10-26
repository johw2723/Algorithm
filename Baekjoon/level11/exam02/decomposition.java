package level11.exam02;

import java.util.Scanner;

public class decomposition {

	// 출저 : https://www.acmicpc.net/problem/2231
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		sc.close();
		
		int answer = 0;
		
		for(int i=0; i<N; i++) {
			int number = i;
			int sum = 0; 
			
			while(number != 0) {
				sum += number % 10; // 각 자리수 더하기
				number /= 10;
			}
			
			// i 값과 각 자리수 누적합이 같을 때 (생성자를 찾았을 때)
			if(sum + i == N) {
				answer = i;
				break;
			}
		}
		
		System.out.print(answer);

	}

}
