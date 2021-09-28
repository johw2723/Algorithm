package level06.exam03;

import java.util.Scanner;

public class number {
	
	// 출저 : https://www.acmicpc.net/problem/1065
	
	public static void main(String[] args) {
		
		// 1~99 : 등차수열 (1 ~ 9 : 그 자체로 수열 / 10 ~ 99 각 자리의 차가 공차)
		// 100~1000 : 실제 구해야할 값의 범위
		
		Scanner sc = new Scanner(System.in);
		System.out.print(checkSequence(sc.nextInt()));
		sc.close();
		
		
	}
	
	public static int checkSequence(int num) {
		int cnt = 0;
		
		if(num<100) {
			return num;
		} else {
			cnt = 99;
			if(num == 1000) {
				num = 999; // 예외처리 : 최대값인 1000은 등차수열이 아니기 때문에 변경
			}
			
			for(int i = 100; i<=num; i++) {
				int hun = i/100;
				int ten = (i/10)%10;
				int one = i%10;
				
				if((hun - ten) == (ten - one)) {
					cnt++;
				}
			}
		}
		
		return cnt;
	}

}
