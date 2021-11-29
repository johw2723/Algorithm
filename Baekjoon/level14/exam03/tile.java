package level14.exam03;

import java.util.Scanner;

public class tile {
	
	// 출저 : https://www.acmicpc.net/problem/1904
	public static int[] dp = new int[1000001];

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		sc.close();
		
		// 동적 계획법 : 메모이제이션
		dp[0] = 0;
		dp[1] = 1;
		dp[2] = 2;
		
		// -1 로 초기화
		for(int i=3; i<dp.length; i++) {
			dp[i] = -1;
		}
		
		System.out.print(Tile(N));
		
	}

	private static int Tile(int N) {
		if(dp[N] == -1) { // 해당 배열에 값이 없을 경우 재귀호출
			dp[N] = (Tile(N - 1) + Tile((N-2))) % 15746;
		}
		return dp[N];
	}

}
