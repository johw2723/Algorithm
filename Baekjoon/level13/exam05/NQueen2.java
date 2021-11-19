package level13.exam05;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class NQueen2 {
	
	// 출저 : https://www.acmicpc.net/problem/9663
	public static int[] arr; // 1차원 배열 생성, 배열 인덱스(위치)는 열을 의미, 인덱스의 값은 행을 의미
	public static int N;
	public static int count;

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		N = Integer.parseInt(br.readLine());
		br.close();
		
		arr = new int[N];
		nQueen(0);
		System.out.print(count);

	}

	private static void nQueen(int depth) {
		// 모든 원소를 다 채운 상태면 count 증가 및 리턴
		if(depth == N) {
			count++;
			return;
		}
		
		for(int i=0; i<N; i++) {
			arr[depth] = i;
			// 놓을 수 있는 위치일 경우 재귀호출, 아니면 반복문 실행
			if(Possibility(depth)) {
				nQueen(depth + 1);
			}
		}
		
	}

	private static boolean Possibility(int col) {
		for(int i=0; i<col; i++) {
			// 해당 열의 행과 i열의 행이 일치할 경우 (같은 행의 존재할 경우)
			if(arr[col] == arr[i]) {
				return false;
			}
			// 열의 차와 행의 차가 같을 경우 (대각선상의 놓여있는 경우)
			else if(Math.abs(col - i) == Math.abs(arr[col] - arr[i])) {
				return false;
			}
		}
		return true;
	}

}
