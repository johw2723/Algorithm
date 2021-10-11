package level08.exam08;

import java.math.BigInteger;
import java.util.Scanner;

public class bigSum3 {
	
	// 출저 : https://www.acmicpc.net/problem/10757

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		// BigInteger 클래스 : int (-2,147,483,648 ~ 2,147,483,647), 
		//                   long (-9,223,372,036,854,775,808 ~ 9,223,372,036,854,775,807)
		// 범위를 초과하는 수를 다룰 때 사용 (문자열 형태로 이루어져 있어서 숫자의 범위가 무한하다)
		BigInteger A = new BigInteger(sc.next());
		BigInteger B = new BigInteger(sc.next());
		sc.close();
		
		System.out.println(A.add(B));

	}

}
