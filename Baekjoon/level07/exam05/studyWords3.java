package level07.exam05;

import java.io.IOException;

public class studyWords3 {
	
	// 출저 : https://www.acmicpc.net/problem/1157

	public static void main(String[] args) throws IOException {
		int str = System.in.read(); // 문자열만 입력 받기에 간소화 가능 : 출력부분에서만 캐스팅
		
		int[] arr = new int[26]; // 알파벳의 개수 26개
		
		while(str >= 'A') {
			if(str <= 'Z') { // 대문자 범위
				arr[str - 'A']++;
			} else { // 소문자 범위
				arr[str - 'a']++;
			}
			str = System.in.read();
		}
		
		int max = 0;
		int ch = '?' - 'A'; // 출력부분에서 대문자로 표현하기 위해
		
		for(int i=0; i<26; i++) {
			if(arr[i] > max) {
				max = arr[i];
				ch = i;
			} else if(arr[i] == max) {
				ch = '?' - 'A';
			}
		} 
		
		System.out.print((char)(ch+'A'));

	}

}
