package level03.exam06;

import java.util.Scanner;

public class nPrint {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		sc.close();
		
		for(int i=N; i>=1; i--) {
			System.out.println(i);
		}

	}

}
