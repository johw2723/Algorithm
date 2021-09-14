package level03.exam11;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class numberX5 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		StringTokenizer token = new StringTokenizer(br.readLine()," ");
		int N = Integer.parseInt(token.nextToken());
		int X = Integer.parseInt(token.nextToken());
		
		StringTokenizer arrToken = new StringTokenizer(br.readLine()," ");
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		for(int i=0; i<N; i++) {
			int temp = Integer.parseInt(arrToken.nextToken());
			if(temp<X) {
				bw.write(temp + " ");
			}
		}
		br.close();
		bw.flush();
		bw.close();	

	}

}
