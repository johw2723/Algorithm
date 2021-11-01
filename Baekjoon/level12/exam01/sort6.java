package level12.exam01;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class sort6 {
	
	// √‚¿˙ : https://www.acmicpc.net/problem/2750

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		
		int[] arr = new int[N];
		
		for(int i=0; i<N; i++) {
			arr[i] = Integer.parseInt(br.readLine());
		}
		
		br.close();
		
		Arrays.sort(arr);
		
		StringBuilder sb = new StringBuilder();
		
		for(int value : arr) {
			sb.append(value).append('\n');
		}
		
		System.out.print(sb);

	}

}
