package level13.exam07;

import java.util.Scanner;

public class Operator {
	
	// 출저 : https://www.acmicpc.net/problem/14888
	public static int N; // 입력 받는 숫자 개수
	public static int[] arr; // 숫자를 담을 배열 
	public static int[] operator = new int[4]; // 연산자 개수
	public static int MAX = Integer.MIN_VALUE; // 최댓값 : 비교 갱신하면서 기록할 것이기 때문
	public static int MIN = Integer.MAX_VALUE; // 최솟값
	
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		N = sc.nextInt();
		arr = new int[N];
		
		for(int i=0; i<N; i++) {
			arr[i] = sc.nextInt();
		}
		
		for(int i=0; i<4; i++) {
			operator[i] = sc.nextInt();
		}
		
		sc.close();
		
		dfs(arr[0], 1);
		
		System.out.println(MAX);
		System.out.println(MIN);

	}

	private static void dfs(int num, int idx) {
		if(idx == N) {
			MAX = Math.max(MAX, num); // 두 수를 비교해서 큰 값으로 갱신
			MIN = Math.min(MIN, num); // 두 수를 비교해서 작은 값으로 갱신
			return;
		}
		
		for(int i=0; i<4; i++) {
			// 연산자 개수가 1개 이상인 경우
			if(operator[i] > 0) {
				operator[i]--; // 해당 연산자를 1감소
				
				switch(i) {
				
				case 0 : dfs(num + arr[idx], idx + 1); break;
				case 1 : dfs(num - arr[idx], idx + 1); break;
				case 2 : dfs(num * arr[idx], idx + 1); break;
				case 3 : dfs(num / arr[idx], idx + 1); break;
				}
				
				// 재귀호출이 종료되면 다시 해당 연산자 개수를 복구한다.
				operator[i]++;
			}
		}
		
	}

}
