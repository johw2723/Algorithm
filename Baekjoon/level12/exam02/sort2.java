package level12.exam02;

import java.util.Arrays;
import java.util.Scanner;

public class sort2 {
	
	// √‚¿˙ : https://www.acmicpc.net/problem/2751

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		
		int[] arr = new int[N];
		
		for(int i=0; i<N; i++) {
			arr[i] = sc.nextInt();
		}
		
		sc.close();
		
		Arrays.sort(arr);
		
		StringBuilder sb = new StringBuilder();
		
		for(int value : arr) {
			sb.append(value).append('\n');
		}

		System.out.print(sb);
		
	}

}
