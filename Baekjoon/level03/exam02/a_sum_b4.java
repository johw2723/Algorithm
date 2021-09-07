package level03.exam02;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class a_sum_b4 {
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine());
		
		StringTokenizer token;	
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		for(int i=0; i<T; i++) {
			token = new StringTokenizer(br.readLine()," ");	
			int A = Integer.parseInt(token.nextToken());
			int B = Integer.parseInt(token.nextToken());
			bw.write(A + B + "\n");
		}
		br.close();
		
		bw.flush();
		bw.close();
	}

}
