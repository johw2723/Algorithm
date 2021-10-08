package level08.exam06;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class president2 {
	
	// 출저 : https://www.acmicpc.net/problem/2775

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine()); // 테스트 케이스의 수
		
		// 조건 : a층 b호 : (a-1)층  1~b호 까지 사람들의 수의 합
		// 비어있는 집 없음, 아파트 0층부터 시작, 각층은 1호부터 시작, 0층의 i호에는 i명이 산다.
		// 1 ≤ k, n ≤ 14
		
		for(int i=0; i<T; i++) {
			
			int h = Integer.parseInt(br.readLine()); // 층
			int w = Integer.parseInt(br.readLine()); // 호
			
			// h 층 n 호 = (h-1)층 1호 + ... (h-1)층 w호
			
			/* i층 1호
			 * 1  4 10 20 35 56 84 120
			 * 1  3  6 10 15 21 28 36 
			 * 1  2  3  4  5  6  7  8 : 0층 n호
			 */
			int[][] APT = new int[15][15];
			
			for(int j=1; j<15; j++) {
				APT[j][1] = 1; // i 층 1호
				APT[0][j] = j; // 0층 i호
			}
			
			for(int j=1; j<15; j++) {
				for(int k=2; k<15; k++) {
					APT[j][k] = APT[j][k - 1] + APT[j - 1][k];
				}
			}
			
			System.out.println(APT[h][w]);

		}

	}

}
