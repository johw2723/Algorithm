package level14.exam03;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class tile2 {
	
	// 출저 : https://www.acmicpc.net/problem/1904
	public static int[] dp = new int[1000001];

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		br.close();
		
		// 메모이제이션
		dp[0] = 0;
		dp[1] = 1;
		dp[2] = 2;
		
		// -1로 초기화 : 비어있는 배열 표시는 -1로 한다.
		for(int i=3; i<dp.length; i++) {
			dp[i] = -1;
		}
		
		System.out.print(Tile(N));
	}

	private static int Tile(int N) {
		if(dp[N] == -1) {
			dp[N] = (Tile(N-1) + Tile(N-2)) % 15746;
		}
		return dp[N];
	}

}
