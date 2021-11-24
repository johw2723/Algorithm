package level13.exam08;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class StratLink2 {
	
	// 출저 : https://www.acmicpc.net/problem/14889
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
		// 팀 조합이 완성될 경우
		if(count == N/2) {
			// 방문한 팀과 방문하지 않은 팀을 각가 나누어 각 팀의 점수를 구한 뒤 최솟값을 찾는다.
			diff();
			return;
		}
		
		for(int i=idx; i<N; i++) {
			// 방문하지 않았다면?
			if(!visit[i]) {
				visit[i] = true;   // 방문으로 변경
				dfs(i+1, count+1); // 재귀호출
				visit[i] = false;  // 재귀가 끝나면 미방문으로 변경
			}
		}
	}

	private static void diff() {
		// 두 팀의 능력치 차이를 구하는 함수
		int team_start = 0;
		int team_link = 0;
		
		for(int i=0; i<N-1; i++) {
			for(int j=i+1; j<N; j++) {
				// i 번째 사람과 j 번째 사람이 true 라면 스타트팀으로 점수를 추가한다.
				if(visit[i] == true && visit[j] == true) {
					team_start += arr[i][j];
					team_start += arr[j][i];
				}
				// i 번째 사람과 j 번째 사람이 false 라면 링크팀으로 점수를 추가한다.
				else if(visit[i] == false && visit[j] == false) {
					team_link += arr[i][j];
					team_link += arr[j][i];
				}
			}
		}
		
		// 두 팀의 차이 (절댓값)
		int value = Math.abs(team_start - team_link);
		
		/*
		 * 두 팀의 점수차가 0 이라면 가장 낮은 최솟값이기 때문에
		 * 더이상 탐색할 필요 없이 0을 출력하고 종료한다.
		 */
		
		if(value == 0) {
			System.out.print(value);
			System.exit(0);
		}
		
		MIN = Math.min(value, MIN);
		
	}

}
