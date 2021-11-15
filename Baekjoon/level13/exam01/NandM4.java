package level13.exam01;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class NandM4 {
	
	// ���� : https://www.acmicpc.net/problem/15649
	// ��Ʈ��ŷ�� ���� ���� 
	
	public static int N; // ���������� ����
	public static int M; // ���������� ����
	public static int[] arr;
	public static boolean[] visit;
	public static StringBuilder sb = new StringBuilder();

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));	
		StringTokenizer token = new StringTokenizer(br.readLine()," ");
		br.close();
		
		// �������� N�� M�� �ʱ�ȭ���ش�.
		N = Integer.parseInt(token.nextToken());
		M = Integer.parseInt(token.nextToken());
		
		arr = new int[M];
		visit = new boolean[N];
		
		// ���������� ����ϱ� ������ N�� M�� �Ѱ��� �ʿ䰡 ��������.
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
