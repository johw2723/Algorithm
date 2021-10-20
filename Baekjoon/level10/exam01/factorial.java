package level10.exam01;

import java.util.Scanner;

public class factorial {
	
	// ÃâÀú : https://www.acmicpc.net/problem/10872

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		sc.close();
		
		if(N == 0) {
			System.out.println(1);
		} 
		else {
			for(int i=N-1; i>0; i--) {
				N = N * i;
			}
			System.out.println(N);
		}

	}

}
