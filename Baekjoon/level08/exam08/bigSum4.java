package level08.exam08;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.StringTokenizer;

public class bigSum4 {
	
	// ���� : https://www.acmicpc.net/problem/10757

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer token = new StringTokenizer(br.readLine()," ");
		
		// BigInteger Ŭ���� : int (-2,147,483,648 ~ 2,147,483,647), 
		//                   long (-9,223,372,036,854,775,808 ~ 9,223,372,036,854,775,807)
		// ������ �ʰ��ϴ� ���� �ٷ� �� ��� (���ڿ� ���·� �̷���� �־ ������ ������ �����ϴ�)
		BigInteger A = new BigInteger(token.nextToken());
		BigInteger B = new BigInteger(token.nextToken());
		br.close();
		
		System.out.println(A.add(B));

	}

}
