package level01.exam11;

import java.util.Scanner;

public class threeDigits2 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int a = scanner.nextInt();
		String b = scanner.next();
		
		scanner.close();
		
		for(int i=b.length()-1; i>=0; i--) {
			System.out.println(a * (b.charAt(i) - '0'));
		}
		
		System.out.println(a * Integer.parseInt(b));
	}

}
