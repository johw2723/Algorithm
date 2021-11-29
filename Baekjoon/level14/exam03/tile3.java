package level14.exam03;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class tile3 {
	
	// 출저 : https://www.acmicpc.net/problem/1904
	public static int[] dp = new int[1000001];

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		br.close();
		
		System.out.print(Tile(N));
	}

	private static int Tile(int N) {
		if(N == 1) {
			return 1;
		}
		if(N == 2) {
			return 2;
		}
		
		// 초기값
		int val1 = 1;
		int val2 = 2;
		int sum = 0;
		
		for(int i=2; i<N; i++) {
			sum = (val1 + val2) % 15746;
			val1 = val2;
			val2 = sum;
		}
		
		return sum;
	}

}
