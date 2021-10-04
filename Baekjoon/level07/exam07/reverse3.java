package level07.exam07;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class reverse3 {
	
	// ���� : https://www.acmicpc.net/problem/2908

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer token = new StringTokenizer(br.readLine()," ");
		br.close();
		
		// StringBuilder() : ���ڿ��� �ٷ�� Ŭ������ �ַ� ����ϸ� reverse() �޼ҵ带 �����Ѵ�.
		int A = Integer.parseInt(new StringBuilder(token.nextToken()).reverse().toString());
		int B = Integer.parseInt(new StringBuilder(token.nextToken()).reverse().toString());
		
		System.out.print(A > B ? A : B); // ���׿����� ������� �ڵ� ���̱�

	}

}
