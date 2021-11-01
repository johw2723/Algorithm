package level12.exam01;

import java.util.Scanner;

public class sort {
	
	// 출저 : https://www.acmicpc.net/problem/2750

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		
		int[] arr = new int[N];
		
		for(int i=0; i<N; i++) {
			arr[i] = sc.nextInt();
		}
		
		sc.close();
		
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
