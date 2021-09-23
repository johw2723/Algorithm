package level05.exam05;

import java.util.Arrays;
import java.util.Scanner;

public class average {
	
	// 출저 : https://www.acmicpc.net/problem/1546

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double[] arr = new double[sc.nextInt()];
		double sum = 0;
		
		// 배열에 값 넣기
		for(int i=0; i<arr.length; i++) {
			arr[i] = sc.nextDouble();
		}
		sc.close();
		
		// 최대값 구하기
		Arrays.sort(arr); // 배열에 저장된 값을 오름차순으로 정렬
		double M = arr[arr.length-1];

		
		// 평균 구하기
		for(int i=0; i<arr.length; i++) {
			sum += (arr[i]/M)*100;
		}
		System.out.println(sum/arr.length);
	}

}
