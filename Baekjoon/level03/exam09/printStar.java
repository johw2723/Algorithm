package level03.exam09;

import java.util.Scanner;

public class printStar {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		sc.close();
		
		String temp = "";
		
		for(int i=1; i<=N; i++) {
			temp += '*';
			System.out.println(temp);

		}

	}

}
