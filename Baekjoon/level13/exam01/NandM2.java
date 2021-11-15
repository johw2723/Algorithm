package level13.exam01;

import java.util.Scanner;

public class NandM2 {
	
	// 출저 : https://www.acmicpc.net/problem/15649
	// 백트래킹에 대한 문제 
	public static int[] arr;
	public static boolean[] visit;
	public static StringBuilder sb = new StringBuilder();

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int M = sc.nextInt();
		sc.close();
		
		arr = new int[M];
		visit = new boolean[N];
		dfs(N, M, 0);
		System.out.print(sb);
		
	}

	private static void dfs(int N, int M, int depth) {
		if(depth == M) {
			for(int value : arr) {
				sb.append(value).append(" ");
			}
			sb.append('\n');
			return;
		}
		
		for(int i=0; i<N; i++) {
			if(!visit[i]) {
				visit[i] = true;
				arr[depth] = i+1;
				dfs(N, M, depth+1);
				visit[i] = false;
			}
		}
		
	}



}
