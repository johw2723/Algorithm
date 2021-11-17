package level13.exam03;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class NandM2 {
	
	// √‚¿˙ : https://www.acmicpc.net/problem/15651
	public static int[] arr;
	public static int N, M;
	public static StringBuilder sb = new StringBuilder();

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer token = new StringTokenizer(br.readLine()," ");
		N = Integer.parseInt(token.nextToken());
		M = Integer.parseInt(token.nextToken());
		br.close();
		
		arr = new int[M];
		dfs(0);
		System.out.print(sb);
		

	}

	private static void dfs(int depth) {
		if(depth == M) {
			for(int value : arr) {
				sb.append(value).append(' ');
			}
			sb.append('\n');
			return;
		}
		
		for(int i=1; i<=N; i++) {
			arr[depth] = i;
			dfs(depth + 1);
		}
	}
}
