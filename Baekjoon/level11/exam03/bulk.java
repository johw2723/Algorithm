package level11.exam03;

import java.util.Scanner;

public class bulk {
	
	// 출저 : https://www.acmicpc.net/problem/7568

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt(); // 전체 사람의 수
		int[][] arr = new int[N][2]; // 몸무게와 키를 담을 2차원 배열
		
		// 입력
		for(int i=0; i<N; i++) {
			arr[i][0] = sc.nextInt(); // 몸무게
			arr[i][1] = sc.nextInt(); // 키
		}
		
		sc.close();
		
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
