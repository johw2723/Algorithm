package level08.exam09;

import java.util.Scanner;

public class fly {
	
	// 출저 : https://www.acmicpc.net/problem/1011

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt(); // 테스트 케이스의 수
		
		/*
		 * 거리(y-x) : move : count : max  /  count : y-x : move : max
		 * 1 : 1 : 1 : 1                  /    1   :  1  : 1    : 1
		 * 2 : 1 1 : 2 : 1                /    2   :  2  : 1 1  : 1
		 * 3 : 1 1 1 : 3 : 1              /    3   :  4  : 1 2 1    : 2
		 * 4 : 1 2 1 : 3 : 2              /    4   :  6  : 1 2 2 1  : 2
		 * 5 : 1 2 1 1 : 4 : 2            /    5   :  9  : 1 2 3 2 1    : 3
		 * 6 : 1 2 2 1 : 4 : 2            /    6   :  12 : 1 2 3 3 2 1  : 3 
		 * 7 : 1 2 2 1 1 : 5 : 2          /    7   :  16 : 1 2 3 4 3 2 1    : 4
		 * 8 : 1 2 2 2 1 : 5 : 2          /    8   :  20 : 1 2 3 4 4 3 2 1  : 4
		 * 9 : 1 2 3 2 1 : 5 : 3          /    9   :  25 : 1 2 3 4 5 4 3 2 1    : 5
		 * 10 : 1 2 3 2 1 1 : 6 : 3       /    10  :  30 : 1 2 3 4 5 5 4 3 2 1  : 5
		 */
		
		// max가 1씩 증가 후 2번씩 반복
		// max가 변하는 지점의 거리는 max의 제곱값 
		
		/* count : y-x : max
		 *   1   :  {1  :  1}
		 *   [2   :  2]  :  1
		 *   [3   :  3]  :  1
		 *   3   :  {4  :  2}
		 *   [4   :  5]  :  2
		 *   4   :  6  :  2
		 *   [5   :  7]  :  2
		 *   5   :  8  :  2
		 *   5   :  {9  :  3}
		 *   [6   :  10] :  3
		 *   6   :  11 :  3
		 *   6   :  12 :  3
		 *   [7   :  13] :  3
		 *   7   :  14 :  3
		 *   7   :  15 :  3
		 *   7   :  {16 :  4}
		 *   [8   :  17] :  4
		 *   8   :  18 :  4    
		 *   8   :  19 :  4    
		 *   8   :  20 :  4    
		 *   [9   :  21] :  4
		 *   9   :  22 :  4    
		 *   9   :  23 :  4    
		 *   9   :  24 :  4    
		 *   9   :  {25 :  5}
		 *   10  :  26 :  5
		 */  
		
		// max의 값은 y-x의 루트 값에서 소수점을버린 정수값과 같다 : max = (int) Math.sqrt(y-x);
		// max가 변하는 지점과 다음 지점 사이에는 항상 count가 두번씩 변한다 {} 사이 [] 2번
		// {} 다음엔 [] 규칙이 반드시 온다. ((y-x) = max*max 다음엔 count가 오른다)
		// max 값이 변할 때의 count 의 수식 : count = (2 * max - 1)
		
		for(int i=0; i<T; i++) {
			int x = sc.nextInt(); // 현재위치
			int y = sc.nextInt(); // 목표위치
			
			int distance = y - x;
			int max = (int)Math.sqrt(distance); // Math.sqrt() : 입력한 값의 루트값을 double 형으로 리턴
			
			if(max == Math.sqrt(distance)){ // distance 의 제곱근이 정수로 떨어진다면 : count = (2*max-1)
				System.out.println(2 * max - 1);
			}
			
			else if(distance <= max * max + max) { // 정수 다음 구간부터 다음 max 이전구간까지 : 묶음 개수는 max 와 같다.
				System.out.println(2 * max);
			}
			
			else { 
				System.out.println(2 * max + 1);
			}
		}
		
		sc.close();

	}

}
