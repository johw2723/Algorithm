package level13.exam04;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class NandM2 {
	
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

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer token = new StringTokenizer(br.readLine()," ");
		br.close();
		
		N = Integer.parseInt(token.nextToken());
		M = Integer.parseInt(token.nextToken());
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
