package level07.exam06;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class countWords2 {
	
	// 출저 : https://www.acmicpc.net/problem/1152

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine().trim(); // trim() :  문자열 앞 뒤 공백을 빈 문자열로 변환, 중간에 있는 공백은 해당 안됨.
		br.close();
		
		// String str = "" != String str = null
		// 빈문자열과 할당 없음은 같지 않다.
		
		int cnt = 0;
		String[] token = str.split(" ");
		
		if(str.length() == 0) { // 공백으로만 주어진 문자열인지 확인
			System.out.print(cnt);		
		} else {				
			for(int i=0; i<token.length; i++) {
				if(token[i] != "") {
					cnt++;
				}
			}
			System.out.print(cnt);
		}

	}

}
