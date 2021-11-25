package level14.exam01;

import java.util.Scanner;

public class fibonacci2 {
	
	// 출저 : https://www.acmicpc.net/problem/1003
	// 동적계획법 : Dynamic Programming (DP)
	// '어떤 주어진 문제를 작은문제로 쪼개서 풀어나감에 있어 반복되는 호출을 줄이는 방법'
	public static Integer[][] dp = new Integer[41][2]; // N은 40보다 작거나 같은 자연수 또는 0
	public static StringBuilder sb = new StringBuilder();
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		dp[0][0] = 1; // N=0 일 때의 0 호출 횟수
		dp[0][1] = 0; // N=0 일 때의 1 호출 횟수
		dp[1][0] = 0; // N=1 일 때의 0 호출 횟수
		dp[1][1] = 1; // N=1 일 때의 1 호출 횟수
		
		int T = sc.nextInt();
		
		while(T--> 0) {
			int N = sc.nextInt();
			fibonacci(N);
			sb.append(dp[N][0]).append(' ').append(dp[N][1]).append('\n');
		}
		
		sc.close();
		System.out.print(sb);

		
	}

	private static Integer[] fibonacci(int N) {
		// N에 대한 0, 1의 호출 횟수가 없을 때 (탐색하지 않은 값일 때)
		if(dp[N][0] == null || dp[N][1] == null) {
			// 각 N에 대한 0 호출 횟수와 1 호출 횟수를 재귀호출한다.
			dp[N][0] = fibonacci(N-1)[0] + fibonacci(N-2)[0];
			dp[N][1] = fibonacci(N-1)[1] + fibonacci(N-2)[1];
		}
		// N에 대한 0과 1, 즉 [N][0]과 [N][1]을 담고있는 [N]을 반환한다.
		return dp[N];
		
	}

}
