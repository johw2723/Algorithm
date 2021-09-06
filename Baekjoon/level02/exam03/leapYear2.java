package level02.exam03;

import java.util.Scanner;

public class leapYear2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int year = sc.nextInt();
		sc.close();		
		
		System.out.println((year%4==0) ? ((year%100!=0 || year%400==0) ? "1" : "0") : "0" );

	}

}
