package level12.exam07;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class coordinate3 {
	
	// 출저 : https://www.acmicpc.net/problem/11651

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		int[][] arr = new int[N][2];
		
		StringTokenizer token;
		for(int i=0; i<N; i++) {
			token = new StringTokenizer(br.readLine()," ");
			arr[i][0] = Integer.parseInt(token.nextToken());
			arr[i][1] = Integer.parseInt(token.nextToken());
		}
		
		br.close();
		
		//람다식
		Arrays.sort(arr, (e1, e2) -> {
			if(e1[1] == e2[1]) {
				return e1[0] - e2[0];
			}
			else {
				return e1[1] - e2[1];
			}
		});
		
		StringBuilder sb = new StringBuilder();
		for(int i=0; i<N; i++) {
			sb.append(arr[i][0]).append(" ").append(arr[i][1]).append('\n');
		}
		
		System.out.print(sb);
	}

}
