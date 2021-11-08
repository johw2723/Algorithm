package level12.exam06;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class coordinate2 {
	
	// √‚¿˙ : https://www.acmicpc.net/problem/11650

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		StringTokenizer token;
		int[][] arr = new int[N][2];
		
		for(int i=0; i<N; i++) {
			token = new StringTokenizer(br.readLine()," ");
			arr[i][0] = Integer.parseInt(token.nextToken());
			arr[i][1] = Integer.parseInt(token.nextToken());
		}
		
		br.close();
		
		for(int i=0; i<N-1; i++) {
			for(int j=i+1; j<N; j++) {
				if(arr[i][0] > arr[j][0]) {
					int temp = arr[j][0];
					arr[j][0] = arr[i][0];
					arr[i][0] = temp;
				} 
				else if(arr[i][0] == arr[j][0]) {
					if(arr[i][1] > arr[j][1]) {
						int temp = arr[j][1];
						arr[j][1] = arr[i][1];
						arr[i][1] = temp;
					}
				}
			}
		}
		
		StringBuilder sb = new StringBuilder();
		
		for(int i=0; i<N; i++) {
			sb.append(arr[i][0]).append(" ").append(arr[i][1]).append('\n');
		}
		
		System.out.print(sb);
	}

}
