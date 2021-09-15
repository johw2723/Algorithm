package level04.exam02;

import java.util.Scanner;

public class a_sum_b {
	
	// √‚¿˙ : https://www.acmicpc.net/problem/10951
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		while(sc.hasNextInt()){
			int A = sc.nextInt();
			int B = sc.nextInt();
			
			System.out.println(A+B);
		}
		sc.close();
	
	}

}
