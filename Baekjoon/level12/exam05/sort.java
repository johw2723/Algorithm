package level12.exam05;

import java.util.Scanner;

public class sort {
	
	// ÃâÀú : https://www.acmicpc.net/problem/1427

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		sc.close();
		
		int[] counting = new int[10];
		
		while(N!=0) {
			counting[N%10]++;
			N/=10;
		}
		
		for(int i=9; i>=0; i--) {
			while(counting[i]-- > 0) {
				System.out.print(i);
			}
		}

	}

}
