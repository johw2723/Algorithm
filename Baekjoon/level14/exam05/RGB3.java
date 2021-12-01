package level14.exam05;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class RGB3 {
	
	// √‚¿˙ : https://www.acmicpc.net/problem/1149
	final static int R = 0;
	final static int G = 1;
	final static int B = 2;

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		
		int[][] cost = new int[N][3];
		
		StringTokenizer token;
		for(int i=0; i<N; i++) {
			token = new StringTokenizer(br.readLine(), " ");
			cost[i][R] = Integer.parseInt(token.nextToken());
			cost[i][G] = Integer.parseInt(token.nextToken());
			cost[i][B] = Integer.parseInt(token.nextToken());
		}
		br.close();
		
		for(int i=1; i<N; i++) {
			cost[i][R] += Math.min(cost[i-1][G], cost[i-1][B]);
			cost[i][G] += Math.min(cost[i-1][R], cost[i-1][B]);
			cost[i][B] += Math.min(cost[i-1][R], cost[i-1][G]);
		}
		
		System.out.print(Math.min(Math.min(cost[N-1][R], cost[N-1][G]), cost[N-1][B]));
	}

}
