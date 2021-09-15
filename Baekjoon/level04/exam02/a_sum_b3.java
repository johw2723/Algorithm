package level04.exam02;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class a_sum_b3 {
	
	// √‚¿˙ : https://www.acmicpc.net/problem/10951
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer token;
		String temp;
		
		StringBuilder sb = new StringBuilder();
		
		while((temp = br.readLine()) != null){
			token = new StringTokenizer(temp," ");
			int A = Integer.parseInt(token.nextToken());
			int B = Integer.parseInt(token.nextToken());
			
			sb.append(A+B).append('\n');
		}
		br.close();
		
		System.out.print(sb);
	
	}
	
}
