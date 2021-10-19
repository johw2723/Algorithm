package level09.exam09;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class triangle2 {
	
	// √‚¿˙ : https://www.acmicpc.net/problem/4153

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer token;
		
		while(true) {
			token = new StringTokenizer(br.readLine()," ");
			int a = Integer.parseInt(token.nextToken());
			int b = Integer.parseInt(token.nextToken());
			int c = Integer.parseInt(token.nextToken());
			
			if(a == 0 && b == 0 && c == 0) {
				break;
			}
			
			if(a*a == (b*b) + (c*c)) {
				System.out.println("right");
			}
			else if(b*b == (a*a) + (c*c)) {
				System.out.println("right");
			} 
			else if(c*c == (a*a) + (b*b)) {
				System.out.println("right");
			}
			else {
				System.out.println("wrong");
			}
		}
		
		br.close();

	}

}
