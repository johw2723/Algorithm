package level07.exam06;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class countWords3 {
	
	// ���� : https://www.acmicpc.net/problem/1152

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));		
		StringTokenizer token = new StringTokenizer(br.readLine()," ");
		br.close();
		
		// String str = "" != String str = null
		// ���ڿ��� �Ҵ� ������ ���� �ʴ�.
		
		System.out.print(token.countTokens()); // countTokens() : ��ū�� ������ ��ȯ�Ѵ�.

	}

}
