package level11.exam05;

import java.util.Scanner;

public class movie3 {
	
	// 출저 : https://www.acmicpc.net/problem/1436

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		sc.close();
		
		if(N>1) {
			naming(N);
		}
		else {
			System.out.print(666);
		}

	}

	private static void naming(int n) {
		int count = 1;
		int prev_digit = 0; // 선수 자릿수
		int num = 0;        // 선수 자릿수를 제외한 나머지 뒷 자리수
		
		// prev_digit이 X...666X 이면서 X...6666 이 아닐경우 (ex : 6660, 6661, ... )
		while(true) {
			if(((prev_digit % 10000) / 10) == 666 && prev_digit % 10 != 6) {
				for(int i=0; i<1000; i++) {
					if(count == n) {
						System.out.print(prev_digit * 1000 + num);
						return;
					}
					num++;
					count++;
				}
				prev_digit++;
			}
			
			// prev_digit이 X...666 일 경우 (ex : 666, 1666, ...)
			else if(prev_digit % 1000 == 666) {
				num = 0;
				for(int i=0; i<1000; i++) {
					if(count == n) {
						System.out.print(prev_digit * 1000 + num);
						return;
					}
					num++;
					count++;				
				}
				prev_digit++;
			}
			
			//prev_digit이 X...6 일 경우 (ex : 66_600, 166_600, ...)
			else if(prev_digit % 100 == 66) {
				num = 600;
				for(int i=0; i<100; i++) {
					if(count == n) {
						System.out.print(prev_digit * 1000 + num);
						return;
					}
					count++;
					num++;
				}
				prev_digit++;
			}
			
			// prev_digit이 X...6 일 경우 (ex : 6_660, 16_660, ...)
			else if(prev_digit % 10 == 6) {
				num = 660;
				for(int i=0; i<10; i++) {
					if(count == n) {
						System.out.print(prev_digit * 1000 + num);
						return;
					}
					num++;
					count++;
				}
				prev_digit++;
			}
			
			// 그 외 (ex : x_666)
			else {
				num = 666;
				if(count == n) {
					System.out.print(prev_digit * 1000 + num);
					return;
				}
				count++;
				prev_digit++;
			}
			
		}
		
	}

}
