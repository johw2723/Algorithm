package level13.exam02;

import java.util.Scanner;

public class NandM {
	
	// ���� : https://www.acmicpc.net/problem/15650
	public static int[] arr;
	public static int N, M;
	public static StringBuilder sb = new StringBuilder();

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		N = sc.nextInt();
		M = sc.nextInt();
		sc.close();
		
		arr = new int[M];
		dfs(1, 0); // ���� ��ġ�� �˱����� ��, ����
		System.out.print(sb);
		
	}

	private static void dfs(int at, int depth) { 
		// ���̰� M�� ���� ��� ���
		if(depth == M) {
			for(int value : arr) {
				sb.append(value).append(' ');
			}
			sb.append('\n');
			return;
		}
		
		// ����ϸ鼭 ��Ʈ��ŷ �� �ݺ���
		for(int i=at; i<=N; i++) {
			arr[depth] = i; // ���� ���̸� index�� �Ͽ� �ش� ��ġ�� i���� �޴´�.
			dfs(i+1, depth+1); // ��� ȣ�� : ���� i������ ���� ��Ϳ��� �� Ŀ���ϹǷ� i+1�� ���� �Ѱ��ְ�, ���� ���� 1�������� ��͸� ȣ���Ѵ�.
		}
		
	}

}
