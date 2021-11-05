package level12.exam05;

import java.util.Arrays;
import java.util.Scanner;

public class sort2 {
	
	// ÃâÀú : https://www.acmicpc.net/problem/1427

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		char[] arr = sc.nextLine().toCharArray();
		sc.close();
		
		Arrays.sort(arr);
		
		for(int i=arr.length-1; i>=0; i--) {
			System.out.print(arr[i]);
		}

	}

}
