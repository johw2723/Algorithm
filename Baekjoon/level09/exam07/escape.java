package level09.exam07;

import java.util.Scanner;

public class escape {
	
	// ÃâÀú : https://www.acmicpc.net/problem/1085

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		int y = sc.nextInt();
		int w = sc.nextInt();
		int h = sc.nextInt();
		sc.close();
		
		int op = 0;
		int op2 = 0;
		
		if(w-x>x) {
			op = x;
		} 
		else {
			op = w-x;
		}
		
		if(h-y>y) {
			op2 = y;
		}
		else {
			op2 = h-y;
		}
		
		if(op>op2) {
			System.out.println(op2);
		}
		else {
			System.out.println(op);
		}

	}

}
