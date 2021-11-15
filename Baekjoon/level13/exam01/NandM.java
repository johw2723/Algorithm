package level13.exam01;

import java.util.Scanner;

public class NandM {
	
	// 출저 : https://www.acmicpc.net/problem/15649
	// 백트래킹에 대한 문제 
	public static int[] arr; // 탐색 과정에서 값을 담을 배열
	public static boolean[] visit; // 유효한 노드인지 검사하기 위한 배열, 방문상태를 판단

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt(); // 1부터 N까지의 자연수
		int M = sc.nextInt(); // 중복 없이 M개 고른 수열 
		sc.close();
		
		arr = new int[M]; // 값을 담을 배열, M개
		visit = new boolean[N]; // 전체 노드 N개
		dfs(N, M, 0); // dfs 재귀함수 생성
		
	}

	private static void dfs(int N, int M, int depth) {
		// 재귀의 깊이가 M과 같아지면 탐색과정에서 담았던 배열을 출력
		if(depth == M) {
			for(int value : arr) {
				System.out.print(value + " ");
			}
			System.out.println();
			return;
		}
		
		
		for(int i=0; i<N; i++) {
			// 만약 노드(값)를 방문하지 않았다면?
			if(!visit[i]) {
				visit[i] = true;        // 해당 노드를 방문 상태로 변경
				arr[depth] = i + 1;     // 해당 깊이를 index로 하여 i+1 값 저장
				dfs(N, M, depth + 1);   // 다음 자식 노드 방문을 위해 depth 를 1 증가시키면서 재귀호출
				
				// 자식 노드 방문이 끝나고 돌아오면 방문노드를 방문하지 않은 상태로 변경
				visit[i] = false;
			}
		}
		
	}

}
