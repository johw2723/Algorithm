package level04.exam01;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class a_sum_b2 {
	//√‚¿˙ : https://www.acmicpc.net/problem/10952
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		StringTokenizer token;
		StringBuilder sb = new StringBuilder();
	
		while(true) {
			token = new StringTokenizer(br.readLine()," ");
			int A = Integer.parseInt(token.nextToken());
			int B = Integer.parseInt(token.nextToken());
			
			if(A == 0 && B == 0) {
				br.close();
				break;
			}
			sb.append(A+B).append("\n");
		}
		
		System.out.println(sb);

	}

}
