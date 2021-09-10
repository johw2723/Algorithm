package level03.exam08;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class a_sum_b3 {
	
	// √‚¿˙ : https://www.acmicpc.net/problem/11022

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		
		StringTokenizer token;
		for(int i=1; i<=N; i++) {
			token = new StringTokenizer(br.readLine()," ");
			int A = Integer.parseInt(token.nextToken());
			int B = Integer.parseInt(token.nextToken());
			System.out.println("Case #"+i+": "+A+" + "+B+" = " +(A+B));
		}
		br.close();

	}

}
