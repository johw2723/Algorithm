package level07.exam06;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class countWords2 {
	
	// ���� : https://www.acmicpc.net/problem/1152

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine().trim(); // trim() :  ���ڿ� �� �� ������ �� ���ڿ��� ��ȯ, �߰��� �ִ� ������ �ش� �ȵ�.
		br.close();
		
		// String str = "" != String str = null
		// ���ڿ��� �Ҵ� ������ ���� �ʴ�.
		
		int cnt = 0;
		String[] token = str.split(" ");
		
		if(str.length() == 0) { // �������θ� �־��� ���ڿ����� Ȯ��
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
