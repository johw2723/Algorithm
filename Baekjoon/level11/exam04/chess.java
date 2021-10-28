package level11.exam04;

import java.util.Scanner;

public class chess {
	
	// 출저 : https://www.acmicpc.net/problem/1018
	
	public static boolean[][] arr;
	public static int min = 64; // 8*8 이 최소

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int M = sc.nextInt();
		
		arr = new boolean[N][M];
		
		// 배열 입력
		for(int i=0; i<N; i++) {
			String str = sc.next();
			
			for(int j=0; j<M; j++) {
				if(str.charAt(j)=='W') {
					arr[i][j] = true; // W일 때 true
				}
				else {
					arr[i][j] = false; // B일 때 false
				}
			}
		}
		sc.close();
		
		int N_row = N-7; // N행 : 최소 크기가 8*8 일 때 경우의 수가 1개이기 때문에 각 길이에 -7을 해준다. 
		int M_col = M-7; // M열 
		
		for(int i=0; i<N_row; i++) {
			for(int j=0; j<M_col; j++) {
				find(i, j);
			}
		}
		System.out.print(min);
	}

	private static void find(int x, int y) {
		int end_x = x + 8;
		int end_y = y + 8;
		int count = 0;
		
		boolean TF = arr[x][y]; // 첫번째 칸의 색 (T 혹은 F)
		
		for(int i=x; i<end_x; i++) {
			for(int j=y; j<end_y; j++) {
				
				// 올바른 색이 아닌경우 count 1증가
				if(arr[i][j] != TF) {
					count++;
				}
				
				TF = (!TF); // 다음 칸은 색이 바뀌므로 역으로 값을 변경
			}
			TF = !TF;
		}
		
		// 첫 번째 칸을 기준으로 할 때의 색칠 할 개수와 (count) 
		// 첫 번째 칸의 색의 반대되는 색을 기준으로 할 때의 색칠 할 개수(64-count) 중 최솟값을 count에 저장
		count = Math.min(count, 64 - count); 
		
		// 이전까지의 경우 중 최솟값보다 현재 count 값이 더 작을 경우 최솟값을 갱신
		min = Math.min(min, count);
	}

}
