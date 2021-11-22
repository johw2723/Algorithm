package level13.exam06;

import java.util.Scanner;

public class sudoku {
	
	// 출저 : https://www.acmicpc.net/problem/2580
	public static int[][] arr = new int[9][9];
	public static StringBuilder sb = new StringBuilder();

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		for(int i=0; i<9; i++) {
			for(int j=0; j<9; j++) {
				arr[i][j] = sc.nextInt();
			}
		}
		
		sc.close();
		
		sudoku(0, 0);
		System.out.print(sb);
		
	}

	private static void sudoku(int row, int col) {
		if(col == 9) {
			sudoku(row + 1, 0);
			return;
		}
		
		if(row == 9) {
			for(int i=0; i<9; i++) {
				for(int j=0; j<9; j++) {
					sb.append(arr[i][j]).append(' ');
				}
				sb.append('\n');
			}
			System.out.print(sb);
			System.exit(0);
		}
		
		// 만약 해당 위치가 0이라면 1부터 9까지 중 가능한 수 탐색
		if(arr[row][col] == 0) {
			for(int i=1; i<=9; i++) {
				if(possibility(row, col, i)) {
					arr[row][col] = i;
					sudoku(row, col+1); 
				}
			}
			arr[row][col] = 0;
			return;
		}
		
		sudoku(row, col+1);
		
	}

	private static boolean possibility(int row, int col, int value) {
		for(int i=0; i<9; i++) {
			if(arr[row][i] == value) {
				return false;
			}
		}
		
		for(int i=0; i<9; i++) {
			if(arr[i][col] == value) {
				return false;
			}
		}
		
		int set_row = (row/3)*3;
		int set_col = (col/3)*3;
		
		for(int i=set_row; i<set_row+3; i++) {
			for(int j=set_col; j<set_col+3; j++) {
				if(arr[i][j] == value) {
					return false;
				}
			}
		}
		return true;
	}

}
