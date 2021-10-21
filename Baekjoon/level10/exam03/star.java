package level10.exam03;

import java.util.Scanner;

public class star {
	
	// 출저 : https://www.acmicpc.net/problem/2447
	
	static char[][] arr;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt(); // N은 3의 거듭제곱
		sc.close();
		
		/* 
		 * *** 
		 * * * arr[1][1] 
		 * *** 
		 */
		
		/* 
		 * *********   
		 * * ** ** * arr[1][1], arr[1][4], arr[1][7]  
		 * ********* 
		 * ***   *** arr[3][3], arr[3][4], arr[3][5]
		 * * *   * * arr[4][1], arr[4][3], arr[4][4], arr[4][5], arr[4][7]
		 * ***   *** arr[5][3], arr[5][4], arr[5][5]
		 * *********
		 * * ** ** * arr[7][1], arr[7][4], arr[7][7]  
		 * *********
		 */
		
		arr = new char[N][N];
		star(0, 0, N, false); // x, y, N, boolean
		
		StringBuilder sb = new StringBuilder();
		for(int i=0; i<N; i++) {
			for(int j=0; j<N; j++) {
				sb.append(arr[i][j]);
			}
			sb.append('\n');
		}
		System.out.print(sb);
	}

	// blank가 true 라면 공백을 의미한다.
	private static void star(int x, int y, int N, boolean blank) {
		// 공백칸일 경우
		if(blank) {
			for(int i=x; i<x+N; i++) {
				for(int j=y; j<y+N; j++) {
					arr[i][j] = ' ';
				}
			}
			return;
		}
		
		// 더이상 쪼갤 수 없는 블록일 때
		if(N == 1) {
			arr[x][y] = '*';
			return;
		}
		
		// N = 27 일 경우 한 블록의 사이즈는 9이고, N = 9 일 경우 한 블록의 사이즈는 3이다	
		int size = N / 3; // 해당 블록의 한 칸을 담을 변수
		int count = 0; // 별 출력 누적
		
		for(int i=x; i<x+N; i+=size) {
			for(int j=y; j<y+N; j+=size) {
				count++;
				if(count == 5) { // 공백 칸일 경우
					star(i, j, size, true);
				}
				else {
					star(i, j, size, false);
				}
			}
		}
	}

}
