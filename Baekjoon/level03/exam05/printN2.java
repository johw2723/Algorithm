package level03.exam05;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class printN2 {
	
	public static void main(String[] args) throws IOException {		
		int N = Integer.parseInt(new BufferedReader(new InputStreamReader(System.in)).readLine());
		
		StringBuilder sb = new StringBuilder();
		for(int i=1; i<=N; i++) {
			sb.append(i+"\n");
		}
		System.out.print(sb);
	}

}
