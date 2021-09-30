package level07.exam04;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.io.IOException;

public class repeat2 {
	
	// √‚¿˙ : https://www.acmicpc.net/problem/2675

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine());
		
		StringTokenizer token;
		
		for(int i=0; i<T; i++) {
			token = new StringTokenizer(br.readLine()," ");
			int R = Integer.parseInt(token.nextToken());
			String S = token.nextToken(); 
			
			for(int j=0; j<S.length(); j++) {
				for(int k=0; k<R; k++) {
					System.out.print(S.charAt(j));
				}
			}
			System.out.println();
		}

		br.close();

	}

}
