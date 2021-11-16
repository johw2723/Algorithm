package level13.exam02;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class NandM2 {
	
	// 출저 : https://www.acmicpc.net/problem/15650
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
		dfs(1, 0); // 현재 위치를 알기위한 값, 깊이
		System.out.print(sb);
		
	}

	private static void dfs(int at, int depth) { 
		// 깊이가 M과 같을 경우 출력
		if(depth == M) {
			for(int value : arr) {
				sb.append(value).append(' ');
			}
			sb.append('\n');
			return;
		}
		
		// 재귀하면서 백트래킹 할 반복문
		for(int i=at; i<=N; i++) {
			arr[depth] = i; // 현재 깊이를 index로 하여 해당 위치에 i값을 받는다.
			dfs(i+1, depth+1); // 재귀 호출 : 현재 i값보다 다음 재귀에서 더 커야하므로 i+1의 값을 넘겨주고, 깊이 또한 1증가시켜 재귀를 호출한다.
		}
		
	}

}
