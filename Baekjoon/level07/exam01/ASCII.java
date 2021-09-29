package level07.exam01;

import java.util.Scanner;

public class ASCII {
	
	// √‚¿˙ : https://www.acmicpc.net/problem/11654

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String temp = sc.next();
		sc.close();
		byte[] bytes = temp.getBytes();
		System.out.println(bytes[0]);

	}

}
