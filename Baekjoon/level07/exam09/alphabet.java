package level07.exam09;

import java.util.Scanner;

public class alphabet {
	
	// ���� : https://www.acmicpc.net/problem/2941

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		sc.close();
		
		int count = 0;
		
		for(int i=0; i<str.length(); i++) {
			char ch = str.charAt(i);
			if(ch == 'c') {
				if(i<str.length()-1) { // �ε��� ���� ������ ����� ������ �����ϱ� ����
					if(str.charAt(i+1) == '=') {
						i++; // c= �� �ϳ��� �����̹Ƿ� 
					} else if(str.charAt(i+1) == '-') {
						i++; // c- �� �ϳ��� �����̹Ƿ�
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
