package level04.exam02;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class a_sum_b2 {
	
	// √‚¿˙ : https://www.acmicpc.net/problem/10951
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer token;
		String temp;
		
		while((temp = br.readLine()) != null){
			token = new StringTokenizer(temp," ");
			int A = Integer.parseInt(token.nextToken());
			int B = Integer.parseInt(token.nextToken());
			
			System.out.println(A+B);
		}
		br.close();
	
	}

}
