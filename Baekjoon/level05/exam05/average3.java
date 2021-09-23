package level05.exam05;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class average3 {
	
	// 출저 : https://www.acmicpc.net/problem/1546

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		int M = -1;
		double sum = 0;
		
		StringTokenizer token = new StringTokenizer(br.readLine()," ");
		
		for(int i=0; i<N; i++) {
			int value = Integer.parseInt(token.nextToken());
			
			// 최대값 구하기
			if(value > M) {
				M = value;
			}
			
			sum += value;
		}
		br.close();

		System.out.println(((sum/M)*100.0)/N);
	}

}
