package level04.exam01;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class a_sum_b3 {
	//√‚¿˙ : https://www.acmicpc.net/problem/10952
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		StringBuilder sb = new StringBuilder();
	
		while(true) {
			String token = br.readLine();
			int A = token.charAt(0) -'0';
			int B = token.charAt(2) -'0';
			
			if(A == 0 && B == 0) {
				br.close();
				break;
			}
			sb.append(A+B).append("\n");
		}
		
		System.out.println(sb);

	}

}
