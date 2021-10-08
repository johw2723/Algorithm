package level08.exam06;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class president3 {
	
	// 출저 : https://www.acmicpc.net/problem/2775
	
	public static int[][] APT = new int[15][15];

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		fill(); // 아파트 채우기
		
		int T = Integer.parseInt(br.readLine()); // 테스트 케이스의 수
		
		for(int i=0; i<T; i++) {
			int h = Integer.parseInt(br.readLine()); // 층
			int w = Integer.parseInt(br.readLine()); // 호
			
			sb.append(APT[h][w]).append('\n');
		}
		
		System.out.println(sb);

	}

	private static void fill() {
		// 아파트 각 호당 인원 채우기
		
		for(int i=1; i<15; i++) {
			APT[i][1] = 1; // i 층 1호
			APT[0][i] = i; // 0층 i호
		}
		
		for(int i=1; i<15; i++) { // 1 층부터 14층까지
			for(int j=2; j<15; j++) { // 2호부터 14호까지
				APT[i][j] = APT[i][j - 1] + APT[i - 1][j];
			}
		}
	}

}
