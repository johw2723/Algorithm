package level03.exam02;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class a_sum_b2 {
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine());
		int[] arr = new int[T];
		
		StringTokenizer token;	
		
		for(int i=0; i<T; i++) {
			token = new StringTokenizer(br.readLine()," ");	
			int A = Integer.parseInt(token.nextToken());
			int B = Integer.parseInt(token.nextToken());
			arr[i] = A + B;
		}
		br.close();
		
		for(int j : arr) {
			System.out.println(j);
		}
		
	}

}
