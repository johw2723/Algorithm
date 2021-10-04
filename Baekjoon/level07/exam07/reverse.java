package level07.exam07;

import java.util.Scanner;

public class reverse {
	
	// ÃâÀú : https://www.acmicpc.net/problem/2908

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String A = sc.next();
		String B = sc.next();
		sc.close();
		
		int A2 = (A.charAt(0) - '0') + ((A.charAt(1) - '0')*10) + ((A.charAt(2) - '0')*100);
		int B2 = (B.charAt(0) - '0') + ((B.charAt(1) - '0')*10) + ((B.charAt(2) - '0')*100);
		
		if(A2>B2) {
			System.out.print(A2);
		} else {
			System.out.print(B2);
		}

	}

}
