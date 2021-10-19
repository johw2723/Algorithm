package level09.exam09;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class triangle3 {
	
	// √‚¿˙ : https://www.acmicpc.net/problem/4153

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer token;
		
		StringBuilder sb = new StringBuilder();
		
		while(true) {
			token = new StringTokenizer(br.readLine()," ");
			int a = Integer.parseInt(token.nextToken());
			int b = Integer.parseInt(token.nextToken());
			int c = Integer.parseInt(token.nextToken());
			
			if(a == 0 && b == 0 && c == 0) break;
		
			if(a*a == (b*b) + (c*c)) sb.append("right").append('\n');
			else if(b*b == (a*a) + (c*c)) sb.append("right").append('\n');
			else if(c*c == (a*a) + (b*b)) sb.append("right").append('\n');
			else sb.append("wrong").append('\n');

		}
		
		br.close();
		System.out.println(sb);

	}

}
