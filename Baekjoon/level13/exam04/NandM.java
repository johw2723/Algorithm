package level13.exam04;

import java.util.Scanner;

public class NandM {
	
	// ���� : https://www.acmicpc.net/problem/15652
	/*
	 * ���� 
	 * 1. 1���� N���� �ڿ��� �߿��� M���� �� ����
	 * 2. ���� ���� ���� �� ��� �ȴ�.
	 * 3. �� ������ �񳻸������̾�� �Ѵ�. : �� �ߺ��� ���ȴ�.
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
