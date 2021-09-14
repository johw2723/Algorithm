package level03.exam11;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class numberX3 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		StringTokenizer token = new StringTokenizer(br.readLine()," ");
		int N = Integer.parseInt(token.nextToken());
		int X = Integer.parseInt(token.nextToken());
		
		StringTokenizer arrToken = new StringTokenizer(br.readLine()," ");
		
		for(int i=0; i<N; i++) {
			int temp = Integer.parseInt(arrToken.nextToken());
			if(temp<X) {
				System.out.print(temp);
				System.out.print(" ");
			}
		}
		br.close();
		

	}

}
