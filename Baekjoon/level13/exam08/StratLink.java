package level13.exam08;

import java.util.Scanner;

public class StratLink {
	
	// 출저 : https://www.acmicpc.net/problem/14889
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
		// 팀 조합이 완성될 경우
		if(count == N/2) {
			// 방만한 팀과 방문하지 않은 팀을 각각 나누어 각 팀의 점수를 구한 뒤 최솟값을 찾는다.
			diff();
			return;
		}
		
		// 방문하지 않았다면?
		for(int i=idx; i<N; i++) {
			if(!visit[i]) {
				visit[i] = true;   // 방문으로 변경
				dfs(i+1, count+1); // 재귀 호출
				visit[i] = false;  // 재귀가 끝나면 비방문으로 변경
			}
		}
	}

	private static void diff() {
		// 두팀의 능력치 차이를 계산하는 함수
		int team_start = 0;
		int team_link = 0;
		
		for(int i=0; i<N-1; i++) {
			for(int j=i+1; j<N; j++) {
				// i번째 사람과 j번째 사람이 true라면 스타트팀으로 점수 
				if(visit[i] == true && visit[j] == true) {
					team_start += arr[i][j];
					team_start += arr[j][i];
				}
				
				// i번째 사람과 j 번째 사람이 false 라면 링크팀으로 점수
				else if(visit[i] == false && visit[j] == false) {
					team_link += arr[i][j];
					team_link += arr[j][i];
				}
			}
		}
		
		// 두 팀의 점수 차이 (절댓값)
		int value = Math.abs(team_start - team_link);
		
		/*
		 * 두 팀의 점수차가 0 이라면 가장 낮은 최솟값이기 때문에
		 * 더이상의 탐색 필요없이 0을 출력하고 종료하면 된다.
		 */
		
		if(value == 0) {
			System.out.println(value);
			System.exit(0);
		}
		
		MIN = Math.min(value, MIN);
		
	}

}
