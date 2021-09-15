package level04.exam03;

import java.util.Scanner;

public class sumCycle {
	
	// √‚¿˙ : https://www.acmicpc.net/problem/1110

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		sc.close();
		
		int cycle = 0;
		int temp = N;
		
		while(true) {
			N = ((N % 10) * 10) + (((N / 10) + (N % 10)) % 10);
			cycle++;
			
			if(N == temp) {
				break;
			}
		}
		System.out.println(cycle);

	}

}
