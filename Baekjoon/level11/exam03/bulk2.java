package level11.exam03;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class bulk2 {
	
	// 출저 : https://www.acmicpc.net/problem/7568

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine()); // 전체 사람 수
		
		StringTokenizer token;
		int[][] arr = new int[N][2]; // 값을 입력받을 변수 선언
		
		// 입력
		for(int i=0; i<N; i++) {
			token = new StringTokenizer(br.readLine()," ");
			arr[i][0] = Integer.parseInt(token.nextToken()); // 몸무게
			arr[i][1] = Integer.parseInt(token.nextToken()); // 키
		}
		
		for(int i=0; i<N; i++) {
			int rank = 1; // 등수는 1등부터 시작한다.
			
			for(int j=0; j<N; j++) {
				if(i == j) continue; // 같은 사람은 비교하지 않는다.
				
				if(arr[i][0] < arr[j][0] && arr[i][1] < arr[j][1]) {
					rank++; // i번째 사람과 j 번째 사람을 비교해서 i가 j보다 덩치가 작을 경우 등수를 올린다
				}
			}
			
			System.out.print(rank + " ");
		}
	}

}
