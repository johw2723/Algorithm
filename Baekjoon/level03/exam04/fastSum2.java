package level03.exam04;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class fastSum2 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		
		StringTokenizer token; 
		StringBuilder sb = new StringBuilder();
		
		
		for(int i=0; i<N; i++) {
			token = new StringTokenizer(br.readLine()," ");
			int A = Integer.parseInt(token.nextToken());
			int B = Integer.parseInt(token.nextToken());
			
			sb.append(A+B+"\n");
		}
		br.close();
		
		System.out.println(sb);

	}

}
