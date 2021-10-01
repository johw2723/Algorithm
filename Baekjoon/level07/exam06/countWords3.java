package level07.exam06;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class countWords3 {
	
	// 출저 : https://www.acmicpc.net/problem/1152

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));		
		StringTokenizer token = new StringTokenizer(br.readLine()," ");
		br.close();
		
		// String str = "" != String str = null
		// 빈문자열과 할당 없음은 같지 않다.
		
		System.out.print(token.countTokens()); // countTokens() : 토큰의 개수를 반환한다.

	}

}
