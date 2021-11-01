package level12.exam01;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class sort2 {
	
	// 출저 : https://www.acmicpc.net/problem/2750

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		
		int[] arr = new int[N];
		
		for(int i=0; i<N; i++) {
			arr[i] = Integer.parseInt(br.readLine());
		}
		
		br.close();
		
		for(int i=0; i<N-1; i++) {
			for(int j=i+1; j<N; j++) {
				
				if(arr[i] > arr[j]) {
					// 값 교환
					int temp = arr[j];
					arr[j] = arr[i]; 
					arr[i] = temp;
				}
			}
		}
		
		for(int value : arr) {
			System.out.println(value);
		}

	}

}
