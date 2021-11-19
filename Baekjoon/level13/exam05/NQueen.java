package level13.exam05;

import java.util.Scanner;

public class NQueen {
	
	// 출저 : https://www.acmicpc.net/problem/9663
	public static int[] arr; // 1차원 배열 생성, 배열 인덱스(위치)는 열을 의미, 인덱스의 값은 행을 의미
	public static int N;
	public static int count;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		N = sc.nextInt();
		sc.close();
		
		arr = new int[N];
		nQueen(0);
		System.out.print(count);

	}

	private static void nQueen(int depth) {
		// 행을 다 채우면 카운트를 1 증가시키고 리턴시킨다.
		if(depth == N) {
			count++;
			return;
		}
		
		for(int i=0; i<N; i++) {
			arr[depth] = i;
			// Possibility() 해당 열에서 i번째 행에 놓을 수 있는지를 검사하고 공격받는다면 재귀호출, 아닐경우 반복문 실행
			if(Possibility(depth)) {
				nQueen(depth + 1);
			}
		}
		
	}

	private static boolean Possibility(int col) {
		for(int i=0; i<col; i++) {
			// 해당 열의 행과 i열의 행이 일치할경우 (같은 행에 존재할 경우)
			if(arr[col] == arr[i]) {
				return false;
			}
			
			// 대각선상에 놓여있는 경우 : 열의 차와 행의 차가 같을 경우
			// Math.abs() : 주어진 숫자의 절댓값을 반환한다.
			else if(Math.abs(col - i) == Math.abs(arr[col] - arr[i])) {
				return false;
			}
		}
		return true;
	}

}
