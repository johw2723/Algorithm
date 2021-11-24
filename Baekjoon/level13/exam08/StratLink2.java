package level13.exam08;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class StratLink2 {
	
	// ���� : https://www.acmicpc.net/problem/14889
	public static int[][] arr;
	public static boolean[] visit;
	public static int N;
	public static int MIN = Integer.MAX_VALUE;

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		N = Integer.parseInt(br.readLine());
		arr = new int[N][N];
		visit = new boolean[N];
		
		StringTokenizer token;
		for(int i=0; i<N; i++) {
			token = new StringTokenizer(br.readLine()," ");
			for(int j=0; j<N; j++) {
				arr[i][j] = Integer.parseInt(token.nextToken());
			}
		}
		
		br.close();
		
		dfs(0, 0);
		System.out.print(MIN);
		
	}

	private static void dfs(int idx, int count) {
		// �� ������ �ϼ��� ���
		if(count == N/2) {
			// �湮�� ���� �湮���� ���� ���� ���� ������ �� ���� ������ ���� �� �ּڰ��� ã�´�.
			diff();
			return;
		}
		
		for(int i=idx; i<N; i++) {
			// �湮���� �ʾҴٸ�?
			if(!visit[i]) {
				visit[i] = true;   // �湮���� ����
				dfs(i+1, count+1); // ���ȣ��
				visit[i] = false;  // ��Ͱ� ������ �̹湮���� ����
			}
		}
	}

	private static void diff() {
		// �� ���� �ɷ�ġ ���̸� ���ϴ� �Լ�
		int team_start = 0;
		int team_link = 0;
		
		for(int i=0; i<N-1; i++) {
			for(int j=i+1; j<N; j++) {
				// i ��° ����� j ��° ����� true ��� ��ŸƮ������ ������ �߰��Ѵ�.
				if(visit[i] == true && visit[j] == true) {
					team_start += arr[i][j];
					team_start += arr[j][i];
				}
				// i ��° ����� j ��° ����� false ��� ��ũ������ ������ �߰��Ѵ�.
				else if(visit[i] == false && visit[j] == false) {
					team_link += arr[i][j];
					team_link += arr[j][i];
				}
			}
		}
		
		// �� ���� ���� (����)
		int value = Math.abs(team_start - team_link);
		
		/*
		 * �� ���� �������� 0 �̶�� ���� ���� �ּڰ��̱� ������
		 * ���̻� Ž���� �ʿ� ���� 0�� ����ϰ� �����Ѵ�.
		 */
		
		if(value == 0) {
			System.out.print(value);
			System.exit(0);
		}
		
		MIN = Math.min(value, MIN);
		
	}

}
