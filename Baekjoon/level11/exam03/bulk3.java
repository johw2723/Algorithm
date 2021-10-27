package level11.exam03;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class bulk3 {
	
	// 출저 : https://www.acmicpc.net/problem/7568

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine()); // 전체 사람 수
		
		int[][] arr = new int[N][2]; // 값을 입력받을 변수 선언
		String[] str;
		
		// 입력
		for(int i=0; i<N; i++) {
			str = br.readLine().split(" ");
			arr[i][0] = Integer.parseInt(str[0]); // 몸무게
			arr[i][1] = Integer.parseInt(str[1]); // 키
		}
		
		StringBuilder sb = new StringBuilder();
		
		for(int i=0; i<N; i++) {
			int rank = 1; // 등수는 1등부터 시작한다.
			
			for(int j=0; j<N; j++) {
				if(i == j) continue; // 같은 사람은 비교하지 않는다.
				
				if(arr[i][0] < arr[j][0] && arr[i][1] < arr[j][1]) {
					rank++; // i번째 사람과 j 번째 사람을 비교해서 i가 j보다 덩치가 작을 경우 등수를 올린다
				}
			}
			
			sb.append(rank).append(" ");
		}
		
		System.out.println(sb);
	}

}
