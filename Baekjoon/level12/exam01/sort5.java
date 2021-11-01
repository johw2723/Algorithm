package level12.exam01;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class sort5 {
	
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
		
		for(int value : arr) {
			System.out.println(value);
		}

	}

}
