package level03.exam10;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class printStarSort4 {
	
	//√‚¿˙ : https://www.acmicpc.net/problem/2439

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		br.close();
		
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		for(int i=1; i<=N; i++) {
			for(int j=1; j<=N-i; j++) {
				bw.write(" ");
			}
			for(int k=1; k<=i; k++) {
				bw.write('*');
			}
			bw.write('\n');
		}
		bw.flush();
		bw.close();
	}

}
