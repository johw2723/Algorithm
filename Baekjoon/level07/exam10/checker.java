package level07.exam10;

import java.util.Scanner;

public class checker {
	
	// ���� : https://www.acmicpc.net/problem/1316
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		int count = 0;
		int N = sc.nextInt();
		
		for(int i=0; i<N; i++) {
			if(check() == true) {
				count++;
			}
		}
		
		System.out.println(count);

	}
	
	public static boolean check() { // �ܾ �ԷµǸ� �׷�ܾ� ���� �ƴ��� ����
		boolean[] check = new boolean[26]; // a~z
		int prev = 0; // �ݺ������� ���ڸ� ������ �� �ռ� ���ڿ� ���ӵǴ��� �ĺ�
		String str = sc.next();
		
		for(int i=0; i<str.length(); i++) {
			int temp = str.charAt(i); // i��° ���� ����
			
			// �ռ� ���ڿ� i��° ���ڰ� ���� �ʴٸ�?
			if(prev != temp) {
				
				// �ش� ���ڰ� ó�� ������ ��� (false)
				if(check[temp - 'a'] == false) {
					check[temp - 'a'] = true; // true �� ���� 
					prev = temp;
				}
				
				// �ش� ���ڰ� ���� ���� �ִ� ��� (true)
				else {
					return false; // �Լ� ����
				}
			}
			
			// �ռ� ���ڿ� i��° ���ڰ� ���ٸ�? (���ӵ� ����)
			else {
				continue;
			}
		}
		return true;
	}

}
