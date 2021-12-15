package level14.exam11;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class partArr3 {
	
	static int[] arr;
	static int[] dp;

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		
		arr = new int[N];
		dp = new int[N];
		
		StringTokenizer token = new StringTokenizer(br.readLine()," "); 
		for(int i=0; i<N; i++) {
			arr[i] = Integer.parseInt(token.nextToken());
		}
		
		br.close();
		
		for(int i=0; i<N; i++) {
			dp[i] = 1;
			
			// 0 ~ i 이전 원소를 탐색
			for(int j=0; j<i; j++) {
				
				// j 번째 원소가 i번째 원소보다 작음과 동시에 i번째 dp가 j번째 dp+1 보다 작은 경우
				if(arr[j] < arr[i] && dp[i] < dp[j] + 1) {
					dp[i] = dp[j] + 1; // j번째 원소의 +1 값이 i번째 dp가 됨
				}
			}
		}
		
		// 최대 길이 탐색
		int max = -1;
		for(int i=0; i<N; i++) {
			if(dp[i] > max) {
				max = dp[i];
			}
		}
		System.out.println(max);

	}
}
