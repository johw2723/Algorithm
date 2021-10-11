package level08.exam08;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.StringTokenizer;

public class bigSum4 {
	
	// 출저 : https://www.acmicpc.net/problem/10757

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer token = new StringTokenizer(br.readLine()," ");
		
		// BigInteger 클래스 : int (-2,147,483,648 ~ 2,147,483,647), 
		//                   long (-9,223,372,036,854,775,808 ~ 9,223,372,036,854,775,807)
		// 범위를 초과하는 수를 다룰 때 사용 (문자열 형태로 이루어져 있어서 숫자의 범위가 무한하다)
		BigInteger A = new BigInteger(token.nextToken());
		BigInteger B = new BigInteger(token.nextToken());
		br.close();
		
		System.out.println(A.add(B));

	}

}
