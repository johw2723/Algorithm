package level05.exam03;

import java.util.Scanner;

public class countNum {
	
	// √‚¿˙ : https://www.acmicpc.net/problem/2577
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int value = (sc.nextInt() * sc.nextInt() * sc.nextInt());
		sc.close();
				
		String st = Integer.toString(value);
		
		for(int i=0; i<10; i++) {
			int count = 0;
			for(int j=0; j<st.length(); j++) {
				if((st.charAt(j) - '0')==i) {
					count++;
				}
			}
			System.out.println(count);
		}
	}
}
