package level07.exam09;

import java.util.Scanner;

public class alphabet2 {
	
	// 출저 : https://www.acmicpc.net/problem/2941

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		sc.close();
		
		int count = 0;
		int length = str.length();
		
		for(int i=0; i<length; i++) {
			
			char ch = str.charAt(i);
			
			// 문자가 c일 경우
			if(ch == 'c' && i < length - 1) {
				if(str.charAt(i+1) == '=' || str.charAt(i+1) == '-') i++; // c= 가 하나의 문자이므로 			
			} 
			
			// 문자가 d일 경우
			else if(ch == 'd' && i < length - 1) {				
				if(str.charAt(i+1) == 'z' && i < length - 2) {if(str.charAt(i+2) == '=') i += 2;}
				else if(str.charAt(i+1) == '-') i++;			
			} 
			
			// 문자가 l 혹은 n일 경우
			else if((ch == 'l' || ch == 'n') && i < length - 1) {
				if(str.charAt(i+1) == 'j') i++;				
			} 

			// 문자가 s 혹은 z 인 경우
			else if((ch == 's' || ch == 'z') && i < length -1) {
				if(str.charAt(i+1) == '=') i++;		
			} 
			
			count++;
		}
		
		System.out.print(count);

	}

}
