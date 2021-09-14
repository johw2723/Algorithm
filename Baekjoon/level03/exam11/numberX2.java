package level03.exam11;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class numberX2 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		StringTokenizer token = new StringTokenizer(br.readLine()," ");
		int N = Integer.parseInt(token.nextToken());
		int X = Integer.parseInt(token.nextToken());
		int[] arr = new int[N];
		
		StringTokenizer arrToken = new StringTokenizer(br.readLine()," ");
		
		for(int i=0; i<N; i++) {
			arr[i] = Integer.parseInt(arrToken.nextToken());
			if(arr[i]<X) {
				System.out.print(arr[i]);
				System.out.print(" ");
			}
		}
		br.close();
		

	}

}
