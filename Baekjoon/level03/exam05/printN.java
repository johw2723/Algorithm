package level03.exam05;

import java.util.Scanner;

public class printN {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		sc.close();
		
		for(int i=1; i<=N; i++) {
			System.out.println(i);
		}
	}

}
