package level13.exam01;

import java.util.Scanner;

public class NandM {
	
	// ���� : https://www.acmicpc.net/problem/15649
	// ��Ʈ��ŷ�� ���� ���� 
	public static int[] arr; // Ž�� �������� ���� ���� �迭
	public static boolean[] visit; // ��ȿ�� ������� �˻��ϱ� ���� �迭, �湮���¸� �Ǵ�

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt(); // 1���� N������ �ڿ���
		int M = sc.nextInt(); // �ߺ� ���� M�� �� ���� 
		sc.close();
		
		arr = new int[M]; // ���� ���� �迭, M��
		visit = new boolean[N]; // ��ü ��� N��
		dfs(N, M, 0); // dfs ����Լ� ����
		
	}

	private static void dfs(int N, int M, int depth) {
		// ����� ���̰� M�� �������� Ž���������� ��Ҵ� �迭�� ���
		if(depth == M) {
			for(int value : arr) {
				System.out.print(value + " ");
			}
			System.out.println();
			return;
		}
		
		
		for(int i=0; i<N; i++) {
			// ���� ���(��)�� �湮���� �ʾҴٸ�?
			if(!visit[i]) {
				visit[i] = true;        // �ش� ��带 �湮 ���·� ����
				arr[depth] = i + 1;     // �ش� ���̸� index�� �Ͽ� i+1 �� ����
				dfs(N, M, depth + 1);   // ���� �ڽ� ��� �湮�� ���� depth �� 1 ������Ű�鼭 ���ȣ��
				
				// �ڽ� ��� �湮�� ������ ���ƿ��� �湮��带 �湮���� ���� ���·� ����
				visit[i] = false;
			}
		}
		
	}

}
