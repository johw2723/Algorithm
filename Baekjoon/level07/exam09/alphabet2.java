package level07.exam09;

import java.util.Scanner;

public class alphabet2 {
	
	// ���� : https://www.acmicpc.net/problem/2941

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		sc.close();
		
		int count = 0;
		int length = str.length();
		
		for(int i=0; i<length; i++) {
			
			char ch = str.charAt(i);
			
			// ���ڰ� c�� ���
			if(ch == 'c' && i < length - 1) {
				if(str.charAt(i+1) == '=' || str.charAt(i+1) == '-') i++; // c= �� �ϳ��� �����̹Ƿ� 			
			} 
			
			// ���ڰ� d�� ���
			else if(ch == 'd' && i < length - 1) {				
				if(str.charAt(i+1) == 'z' && i < length - 2) {if(str.charAt(i+2) == '=') i += 2;}
				else if(str.charAt(i+1) == '-') i++;			
			} 
			
			// ���ڰ� l Ȥ�� n�� ���
			else if((ch == 'l' || ch == 'n') && i < length - 1) {
				if(str.charAt(i+1) == 'j') i++;				
			} 

			// ���ڰ� s Ȥ�� z �� ���
			else if((ch == 's' || ch == 'z') && i < length -1) {
				if(str.charAt(i+1) == '=') i++;		
			} 
			
			count++;
		}
		
		System.out.print(count);

	}

}
