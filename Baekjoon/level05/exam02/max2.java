package level05.exam02;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class max2 {
	
	// 출저 : https://www.acmicpc.net/problem/2562

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int[] arr = new int[9];
		
		int count = 0;
		int max = 0;
		int index = 0;
		
		// 배열 채우기
		for(int i=0; i<9; i++) {
			arr[i] = Integer.parseInt(br.readLine());
		}
		
		// 로직
		for(int value : arr) {
			count++;
			
			if(value>max) {
				max = value;
				index = count;
			}
		}
		
		System.out.println(max + "\n" + index);

	}

}
