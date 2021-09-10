package level03.exam07;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class a_sum_b2 {
	
	// √‚¿˙ : https://www.acmicpc.net/problem/11021

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		
		StringTokenizer token;
		
		for(int i=0; i<N; i++) {
			token = new StringTokenizer(br.readLine()," ");
			int A = Integer.parseInt(token.nextToken());
			int B = Integer.parseInt(token.nextToken());
			System.out.println("Case #" +(i+1)+ ": " + (A+B));		
		}
		br.close();

	}

}
