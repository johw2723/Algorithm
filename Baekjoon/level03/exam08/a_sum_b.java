package level03.exam08;

import java.util.Scanner;

public class a_sum_b {
	
	// √‚¿˙ : https://www.acmicpc.net/problem/11022

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		
		for(int i=1; i<=N; i++) {
			int A = sc.nextInt();
			int B = sc.nextInt();
			System.out.println("Case #"+i+": "+A+" + "+B+" = " +(A+B));
		}
		sc.close();

	}

}
