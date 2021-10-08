package level08.exam05;

import java.util.Scanner;

public class hotel {
	
	// 출저 : https://www.acmicpc.net/problem/10250

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt(); // 테스트 케이스의 수
		
		for(int i=0; i<T; i++) {
			int H = sc.nextInt(); // 호텔의 층 수
			int W = sc.nextInt(); // 각 층의 방 수
			int N = sc.nextInt(); // 몇 번째 손님
			
			// 2 3 5 : 101 201 / 102 202 / 103 203
			// 6 12 10 : 101 201 301 401 501 601 / 102 202 302 [402] 502 602 
			// 6 12 15 : 101 201 301 401 501 601 / 102 202 302 402 502 602 / 103 203 [303] 403 503 603 
			
			// Y 층 : N % H , 예외 N % H = 0 일 때 Y=H
			// X 방 :(N / H) + 1 :: X는 1부터 시작, 예외 N % H = 0 일 때 X = (N / H)
			
			if(N % H == 0) { // H 층이 배정받는 층 수
				System.out.println((H*100) + (N / H));
			}
			
			else {
				System.out.println((N % H)*100 + (N / H)+1);
			}
			
			
		}
		sc.close();

	}

}
