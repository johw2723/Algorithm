package level07.exam07;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class reverse3 {
	
	// 출저 : https://www.acmicpc.net/problem/2908

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer token = new StringTokenizer(br.readLine()," ");
		br.close();
		
		// StringBuilder() : 문자열을 다루는 클래스로 주로 사용하며 reverse() 메소드를 포함한다.
		int A = Integer.parseInt(new StringBuilder(token.nextToken()).reverse().toString());
		int B = Integer.parseInt(new StringBuilder(token.nextToken()).reverse().toString());
		
		System.out.print(A > B ? A : B); // 삼항연산자 사용으로 코드 줄이기

	}

}
