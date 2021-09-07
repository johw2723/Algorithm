package level03.exam02;

import java.util.Scanner;

public class a_sum_b {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		int[] arr = new int[T];
		
		for(int i=0; i<T; i++) {
			int A = sc.nextInt();
			int B = sc.nextInt();
			arr[i] = A + B;
		}
		sc.close();
		
		for(int j : arr) {
			System.out.println(j);
		}
		
	}

}
