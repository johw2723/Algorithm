package level11.exam04;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class chess2 {
	
	// 출저 : https://www.acmicpc.net/problem/1018
	
	public static boolean[][] arr;
	public static int min = 64; // 8*8 이 최소

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer token = new StringTokenizer(br.readLine()," ");
		int N = Integer.parseInt(token.nextToken());
		int M = Integer.parseInt(token.nextToken());
		
		arr = new boolean[N][M];
		
		// 배열 입력
		for(int i=0; i<N; i++) {
			String str = br.readLine();
			
			for(int j=0; j<M; j++) {
				if(str.charAt(j)=='W') {	
					arr[i][j] = true; // W일 때 true
				}
				else {
					arr[i][j] = false; // B일 때 false
				}
			}
		}
		br.close();
		
		// 최소 크기가 8*8 일 때 경우의 수가 1개이기 때문에 각 행렬에 -7을 해준다.
		
		for(int i=0; i<N-7; i++) {
			for(int j=0; j<M-7; j++) {
				find(i, j);
			}
		}
		
		System.out.println(min);
		
	}

	private static void find(int x, int y) {
		
		int count = 0;
			
		boolean TF = arr[x][y]; // 첫 번째 칸의 색을 확인한다. W면 T / B 면 F
		
		for(int i=x; i<x+8; i++) {
			for(int j=y; j<y+8; j++) {
				
				// 올바른 색이 아닐 경우 count 1 증가
				if(arr[i][j] != TF) {
					count++;
				}
				
				TF = (!TF); // 다음 칸은 색이 바뀌므로 역으로 값을 변경
			}
			TF = !TF;
		}
		
		// 첫 번째 칸을 기준으로 할 때의 색칠할 개수와 반대되는 색을 기준으로 할 때의 색칠할 개수 중 최솟값을 저장
		count = Math.min(count, 64 - count); 
		
		// 이전까지의 경우 중 최솟값보다 현재 count 값이 더 작을 경우 min을 갱신
		min = Math.min(min, count);
		
	}
}
