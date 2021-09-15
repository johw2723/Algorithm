package level04.exam02;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class a_sum_b4 {
	
	// √‚¿˙ : https://www.acmicpc.net/problem/10951
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String temp;
		
		StringBuilder sb = new StringBuilder();
		
		while((temp = br.readLine()) != null){
			int A = temp.charAt(0) - '0';
			int B = temp.charAt(2) - '0';
			
			sb.append(A+B).append('\n');
		}
		br.close();
		
		System.out.print(sb);
	
	}
	
}
