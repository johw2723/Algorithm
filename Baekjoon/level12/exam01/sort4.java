package level12.exam01;

import java.util.Arrays;
import java.util.Scanner;

public class sort4 {
	
	// 출저 : https://www.acmicpc.net/problem/2750

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		
		int[] arr = new int[N];
		
		for(int i=0; i<N; i++) {
			arr[i] = sc.nextInt();
		}
		
		sc.close();
		
		// Arrays.sort 메소드 : 자바에서 직접 제공해주는 정렬 메소드로 sort()안에 배열을 넣으면 자동으로 배열이 정렬되어나온다.
		// dual-pivot Quicksort 알고리즘으로 시간복잡도는 평균 O(nlogn)으로 버블정렬보다 좋은 성능을 낸다 
		Arrays.sort(arr);
		
		for(int value : arr) {
			System.out.println(value);
		}

	}

}
