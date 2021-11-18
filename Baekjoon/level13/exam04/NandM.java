package level13.exam04;

import java.util.Scanner;

public class NandM {
	
	// 출저 : https://www.acmicpc.net/problem/15652
	/*
	 * 조건 
	 * 1. 1부터 N까지 자연수 중에서 M개를 고른 수열
	 * 2. 같은 수를 여러 번 골라도 된다.
	 * 3. 고른 수열은 비내림차순이어얗 한다. : 즉 중복이 허용된다.
	 */
	
	public static int[] arr;
	public static int N, M;
	public static StringBuilder sb = new StringBuilder();

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		N = sc.nextInt();
		M = sc.nextInt();
		sc.close();
		
		arr = new int[M];
		dfs(1, 0);
		System.out.print(sb);
	}

	private static void dfs(int at, int depth) {
		if(depth == M) {
			for(int value : arr) {
				sb.append(value).append(' ');
			}
			sb.append('\n');
			return;
		}
		
		for(int i=at; i<=N; i++) {
			arr[depth] = i;
			dfs(i, depth+1);
		}
		
	}

}
