package level13.exam08;

import java.util.Scanner;

public class StratLink {
	
	// ���� : https://www.acmicpc.net/problem/14889
	public static int[][] arr;
	public static boolean[] visit;
	public static int N;
	public static int MIN = Integer.MAX_VALUE;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		N = sc.nextInt();
		arr = new int[N][N];
		visit = new boolean[N];
		
		for(int i=0; i<N; i++) {
			for(int j=0; j<N; j++) {
				arr[i][j] = sc.nextInt();
			}
		}
		
		sc.close();
		
		dfs(0, 0);
		System.out.print(MIN);

	}

	private static void dfs(int idx, int count) {
		// �� ������ �ϼ��� ���
		if(count == N/2) {
			// �游�� ���� �湮���� ���� ���� ���� ������ �� ���� ������ ���� �� �ּڰ��� ã�´�.
			diff();
			return;
		}
		
		// �湮���� �ʾҴٸ�?
		for(int i=idx; i<N; i++) {
			if(!visit[i]) {
				visit[i] = true;   // �湮���� ����
				dfs(i+1, count+1); // ��� ȣ��
				visit[i] = false;  // ��Ͱ� ������ ��湮���� ����
			}
		}
	}

	private static void diff() {
		// ������ �ɷ�ġ ���̸� ����ϴ� �Լ�
		int team_start = 0;
		int team_link = 0;
		
		for(int i=0; i<N-1; i++) {
			for(int j=i+1; j<N; j++) {
				// i��° ����� j��° ����� true��� ��ŸƮ������ ���� 
				if(visit[i] == true && visit[j] == true) {
					team_start += arr[i][j];
					team_start += arr[j][i];
				}
				
				// i��° ����� j ��° ����� false ��� ��ũ������ ����
				else if(visit[i] == false && visit[j] == false) {
					team_link += arr[i][j];
					team_link += arr[j][i];
				}
			}
		}
		
		// �� ���� ���� ���� (����)
		int value = Math.abs(team_start - team_link);
		
		/*
		 * �� ���� �������� 0 �̶�� ���� ���� �ּڰ��̱� ������
		 * ���̻��� Ž�� �ʿ���� 0�� ����ϰ� �����ϸ� �ȴ�.
		 */
		
		if(value == 0) {
			System.out.println(value);
			System.exit(0);
		}
		
		MIN = Math.min(value, MIN);
		
	}

}
