package level13.exam03;

import java.util.Scanner;

public class NandM {
	
	// √‚¿˙ : https://www.acmicpc.net/problem/15651
	public static int[] arr;
	public static int N, M;
	public static StringBuilder sb = new StringBuilder();

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		N = sc.nextInt();
		M = sc.nextInt();
		sc.close();
		
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
