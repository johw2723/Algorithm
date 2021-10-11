package level08.exam08;

import java.math.BigInteger;
import java.util.Scanner;

public class bigSum3 {
	
	// ���� : https://www.acmicpc.net/problem/10757

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		// BigInteger Ŭ���� : int (-2,147,483,648 ~ 2,147,483,647), 
		//                   long (-9,223,372,036,854,775,808 ~ 9,223,372,036,854,775,807)
		// ������ �ʰ��ϴ� ���� �ٷ� �� ��� (���ڿ� ���·� �̷���� �־ ������ ������ �����ϴ�)
		BigInteger A = new BigInteger(sc.next());
		BigInteger B = new BigInteger(sc.next());
		sc.close();
		
		System.out.println(A.add(B));

	}

}
