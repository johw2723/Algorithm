package level07.exam06;

import java.util.Scanner;

public class countWords {
	
	// ���� : https://www.acmicpc.net/problem/1152

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine().trim(); // trim() :  ���ڿ� �� �� ������ �� ���ڿ��� ��ȯ, �߰��� �ִ� ������ �ش� �ȵ�.
		sc.close();
		
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
