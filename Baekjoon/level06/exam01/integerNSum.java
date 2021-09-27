package level06.exam01;

import java.util.Scanner;

public class integerNSum {
	
	// ÃâÀú : https://www.acmicpc.net/problem/15596

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] arr = new int[sc.nextInt()];
		
		for(int i=0; i<arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		sc.close();
		
		long result = new Test().sum(arr);
		
		System.out.println(result);

	}

}
