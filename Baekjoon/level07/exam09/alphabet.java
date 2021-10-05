package level07.exam09;

import java.util.Scanner;

public class alphabet {
	
	// 출저 : https://www.acmicpc.net/problem/2941

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		sc.close();
		
		int count = 0;
		
		for(int i=0; i<str.length(); i++) {
			char ch = str.charAt(i);
			if(ch == 'c') {
				if(i<str.length()-1) { // 인덱스 참조 범위를 벗어나는 오류를 방지하기 위해
					if(str.charAt(i+1) == '=') {
						i++; // c= 가 하나의 문자이므로 
					} else if(str.charAt(i+1) == '-') {
						i++; // c- 가 하나의 문자이므로
					}
				}			
			} else if(ch == 'd') {
				if(i<str.length()-1) {
					if(str.charAt(i+1) == 'z') {
						if(i<str.length()-2) {
							if(str.charAt(i+2) == '=') {
								i++;
								i++;
							}
						}					
					} else if(str.charAt(i+1) == '-') {
						i++;
					}
				}			
			} else if(ch == 'l') {
				if(i<str.length()-1) {
					if(str.charAt(i+1) == 'j') {
						i++;
					}
				}
				
			} else if(ch == 'n') {
				if(i<str.length()-1) {
					if(str.charAt(i+1) == 'j') {
						i++;
					}
				}			
			} else if(ch == 's') {
				if(i<str.length()-1) {
					if(str.charAt(i+1) == '=') {
						i++;
					}
				}			
			} else if(ch =='z') {
				if(i<str.length()-1) {
					if(str.charAt(i+1) == '=') {
						i++;
					}
				}			
			}
			
			count++;
		}
		
		System.out.print(count);

	}

}
