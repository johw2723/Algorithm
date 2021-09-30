package level07.exam03;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class search4 {
	
	// 출저 : https://www.acmicpc.net/problem/10809

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String S = br.readLine();
		br.close();
		
		// 영어 알파벳의 개수를 가진 배열 생성 : 문자열 S에 각 문자의 위치를 가리킬 배열
		int[] arr = new int[26]; 
		
		// 배열의 초기화 값으로 문제에서 제시한 -1 값 
		for(int i=0; i<arr.length; i++) {
			arr[i] = -1;
		}
		
		// 각 문자 검사 : 1. charAt 문자열 추출 / 2. ch 변수에 저장 
		for(int i=0; i<S.length(); i++) {
			char ch = S.charAt(i);
			
			/* ch 문자의 위치를 배열 arr의 값으로 변경 : arr[ch-'a'] = i 이다. (문제조건 위치는 0부터 시작)
			 * baekjoon :: arr['b'-'a'] = arr['98'-'97'] = arr[1] = 0 (i) 
			 * baekjoon :: arr['a'-'a'] = arr['97'-'97'] = arr[0] = 1 (i) 
			 */
			if(arr[ch - 'a'] == -1) { // 동일 문자가 포함 : 처음 나타난 위치 표기 = arr 원소 값이 -1 일 경우 원소값 변경 / -1이 아닌경우 변경하지 않음
				arr[ch - 'a'] = i;
			}
		}
		
		for(int value : arr) {
			System.out.print(value + " ");
		}
		
	}

}
