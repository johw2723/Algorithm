package level07.exam10;

import java.util.Scanner;

public class checker {
	
	// 출저 : https://www.acmicpc.net/problem/1316
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		int count = 0;
		int N = sc.nextInt();
		
		for(int i=0; i<N; i++) {
			if(check() == true) {
				count++;
			}
		}
		
		System.out.println(count);

	}
	
	public static boolean check() { // 단어가 입력되면 그룹단어 인지 아닌지 리턴
		boolean[] check = new boolean[26]; // a~z
		int prev = 0; // 반복문에서 문자를 꺼내올 때 앞선 문자와 연속되는지 식별
		String str = sc.next();
		
		for(int i=0; i<str.length(); i++) {
			int temp = str.charAt(i); // i번째 문자 저장
			
			// 앞선 문자와 i번째 문자가 같지 않다면?
			if(prev != temp) {
				
				// 해당 문자가 처음 나오는 경우 (false)
				if(check[temp - 'a'] == false) {
					check[temp - 'a'] = true; // true 로 변경 
					prev = temp;
				}
				
				// 해당 문자가 나온 적이 있는 경우 (true)
				else {
					return false; // 함수 종료
				}
			}
			
			// 앞선 문자와 i번째 문자가 같다면? (연속된 문자)
			else {
				continue;
			}
		}
		return true;
	}

}
