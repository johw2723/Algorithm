package level13.exam02;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class NandM2 {
	
	// ���� : https://www.acmicpc.net/problem/15650
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
