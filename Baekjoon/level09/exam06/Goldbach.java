package level09.exam06;

import java.util.Scanner;

public class Goldbach {
	
	// 출저 : https://www.acmicpc.net/problem/9020
	
	public static boolean[] prime = new boolean[10001];

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt(); // 테스트 케이스의 개수
		
		get_prime();
		
		for(int i=0; i<T; i++) {
			int N = sc.nextInt();
			
			/* 
			 * 요구사항 : 두 소수의 차가 작은 것을 출력
			 * n = p + q (p와 q 는 소수) 일 때 p와 q가 소수가 아니라면 p는 감소 q는 증가시키면서 만족할 때 까지 찾는 것 
			 */
			
			int p = N/2;
			int q = N/2;
			
			while(true) {
				
				// 두 파티션이 모두 소수일 경우
				if(!prime[p] && !prime[q]) {
					System.out.println(p + " " + q);
					break;
				}
				p--;
				q++;
			}
		}
		
		sc.close();

	}

	// 에라토스테네스의 체 알고리즘
	private static void get_prime() {
		prime[0] = prime[1] = true;
		
		for(int i=2; i<=Math.sqrt(prime.length); i++) {
			if(prime[i]) continue;
			for(int j=i*i; j<prime.length; j+=i) {
				prime[j] = true;
			}
		}
		
	}

}
