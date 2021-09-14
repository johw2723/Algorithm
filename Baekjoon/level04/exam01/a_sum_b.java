package level04.exam01;

import java.util.Scanner;

public class a_sum_b {
	//√‚¿˙ : https://www.acmicpc.net/problem/10952
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
	
		while(true) {
			int A = sc.nextInt();
			int B = sc.nextInt();
			
			if(A == 0 && B == 0) {
				sc.close();
				break;
			}
			System.out.println(A+B);
		}

	}

}
