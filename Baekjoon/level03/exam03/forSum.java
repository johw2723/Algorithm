package level03.exam03;

import java.util.Scanner;

public class forSum {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		sc.close();
		
		int result = 0;
		
		for(int i=1; i<=N; i++) {
			result += i;
		}
		
		System.out.println(result);

	}

}
