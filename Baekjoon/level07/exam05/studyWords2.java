package level07.exam05;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class studyWords2 {
	
	// 출저 : https://www.acmicpc.net/problem/1157

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine().toUpperCase(); // 대문자로 변환
		br.close();
		
		int[] arr = new int[26]; // 알파벳의 개수 26개
		
		for(int i=0; i<str.length(); i++) {
			if('A' <= str.charAt(i) && str.charAt(i) <= 'Z') {
				arr[str.charAt(i) - 'A']++; // 해당 인덱스의 값 1 증가
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
