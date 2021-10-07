package level08.exam03;

import java.util.Scanner;

public class search {
	
	// 출저 : https://www.acmicpc.net/problem/1193

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int X = sc.nextInt();
		sc.close();
		
		/*
		 * 1/1 : A case = 개수가 홀수, 분모>=분자 시작, 우상향
		 * 1/2 2/1 : B case = 개수가 짝수, 분자>분모 시작, 좌하향
		 * 3/1 2/2 1/3 : A
		 * 1/4 2/3 3/2 4/1 : B
		 * 5/1 4/2 3/3 2/4 1/5 : A 
		 */
		
		int count = 1; // 대각선의 개수 (홀수, 짝수 구분)
		int sum = 0; // 해당 대각선까지 칸의 누적합 
		
		while(true) {
			
			// 범위 판별 
			if(X <= count + sum) {
				if(count % 2 == 1) { // 대각선의 개수가 홀수 = 분자가 큰 수부터 시작
					// 분자 : 대각선 개수 - (X번째 - 직전 대각선까지의 누적합 -1)
					// 분모 : X번째 - 직전 대각선까지 칸의 누적합
					System.out.print((count - (X - sum - 1)) + "/" + (X - sum));
					break;
				}
				
				else { // 대각선의 개수가 짝수 = 분모가 큰 수부터 시작 (출력 반대)
					System.out.print((X - sum) + "/" + (count - (X - sum -1)));
					break;
				}
			} else { // 대각선의 개수와 대각선까지 칸의 누적합이 X보다 작을 때 
				sum += count; // 1번째 선에선 1칸, 2번째 선에선 1칸 + 2칸, 3번째 선에선 1 + 2+ 3칸 
				count++;
				
				/* ex : X = 3
				 * sequence 1 :: 3 <= (1 + 0) : false / 0 += 1 : sum = 1, count = 2  
				 * sequence 2 :: 3 <= (2 + 1) : true 
				 *             : if ( 2 % 2 == 1 ) : false
				 *             : (3 - 1) / (2 - (3 - 1 - 1)) = 2 / 1
				 */
			}
		}

	}

}
