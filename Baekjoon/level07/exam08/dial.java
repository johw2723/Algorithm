package level07.exam08;

import java.util.Scanner;

public class dial {
	
	// √‚¿˙ : https://www.acmicpc.net/problem/5622

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String temp = sc.next();
		sc.close();
		
		int count = 0;
		
		for(int i=0; i<temp.length(); i++) {
			if(temp.charAt(i) == 'A' || temp.charAt(i) == 'B' || temp.charAt(i) == 'C') {
				count += 3;
			} else if(temp.charAt(i) == 'D' || temp.charAt(i) == 'E' || temp.charAt(i) == 'F') {
				count += 4;
			} else if(temp.charAt(i) == 'G' || temp.charAt(i) == 'H' || temp.charAt(i) == 'I') {
				count += 5;
			} else if(temp.charAt(i) == 'J' || temp.charAt(i) == 'K' || temp.charAt(i) == 'L') {
				count += 6;
			} else if(temp.charAt(i) == 'M' || temp.charAt(i) == 'N' || temp.charAt(i) == 'O') {
				count += 7;
			} else if(temp.charAt(i) == 'P' || temp.charAt(i) == 'Q' || temp.charAt(i) == 'R' || temp.charAt(i) == 'S') {
				count += 8;
			} else if(temp.charAt(i) == 'T' || temp.charAt(i) == 'U' || temp.charAt(i) == 'V') {
				count += 9;
			} else if(temp.charAt(i) == 'W' || temp.charAt(i) == 'X' || temp.charAt(i) == 'Y' || temp.charAt(i) == 'Z') {
				count += 10;
			}
		
		}
		
		System.out.print(count);
		
	}

}
