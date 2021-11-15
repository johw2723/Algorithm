package level13.exam01;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class NandM4 {
	
	// 출저 : https://www.acmicpc.net/problem/15649
	// 백트래킹에 대한 문제 
	
	public static int N; // 정적변수로 변경
	public static int M; // 정적변수로 변경
	public static int[] arr;
	public static boolean[] visit;
	public static StringBuilder sb = new StringBuilder();

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));	
		StringTokenizer token = new StringTokenizer(br.readLine()," ");
		br.close();
		
		// 정적변수 N과 M을 초기화해준다.
		N = Integer.parseInt(token.nextToken());
		M = Integer.parseInt(token.nextToken());
		
		arr = new int[M];
		visit = new boolean[N];
		
		// 정적변수를 사용하기 때문에 N과 M을 넘겨줄 필요가 없어진다.
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
		
		for(int i=0; i<N; i++) {
			if(!visit[i]) {
				visit[i] = true;
				arr[depth] = i+1;
				dfs(depth+1);
				visit[i] = false;
			}
		}
		
	}

}
