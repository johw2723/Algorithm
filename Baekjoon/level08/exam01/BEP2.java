package level08.exam01;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BEP2 {
	
	// ���� : https://www.acmicpc.net/problem/1712

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer token = new StringTokenizer(br.readLine()," ");
		br.close();
		
		int A = Integer.parseInt(token.nextToken()); // �������
		int B = Integer.parseInt(token.nextToken()); // �������
		int C = Integer.parseInt(token.nextToken()); // ��ǰ����
		
		
		if(B>=C) {
			System.out.print(-1);
		} else {
			// n*C = A + (n*B)
			// nC - nB = A
			// n(C-B) = A
			// n = A(C-B)
			System.out.print((A/(C-B))+1); // +1 : ������ �߻��ϴ� ���� 
		}
	}

}
