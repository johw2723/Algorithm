package level07.exam05;

import java.util.Scanner;

public class studyWords {
	
	// ���� : https://www.acmicpc.net/problem/1157

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.next().toUpperCase(); // �빮�ڷ� ��ȯ
		sc.close();
		
		int[] arr = new int[26]; // ���ĺ��� ���� 26��
		
		for(int i=0; i<str.length(); i++) {
			if('A' <= str.charAt(i) && str.charAt(i) <= 'Z') {
				arr[str.charAt(i) - 'A']++; // �ش� �ε����� �� 1 ����
			}
		}
		
		int max = 0;
		char ch = '?';
		
		for(int i=0; i<26; i++) {
			if(arr[i] > max) {
				max = arr[i];
				ch = (char)(i + 'A');
			} else if(arr[i] == max) {
				ch = '?';
			}
		} 
		
		System.out.print(ch);

	}

}
