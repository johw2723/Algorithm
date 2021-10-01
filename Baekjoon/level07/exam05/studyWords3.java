package level07.exam05;

import java.io.IOException;

public class studyWords3 {
	
	// ���� : https://www.acmicpc.net/problem/1157

	public static void main(String[] args) throws IOException {
		int str = System.in.read(); // ���ڿ��� �Է� �ޱ⿡ ����ȭ ���� : ��ºκп����� ĳ����
		
		int[] arr = new int[26]; // ���ĺ��� ���� 26��
		
		while(str >= 'A') {
			if(str <= 'Z') { // �빮�� ����
				arr[str - 'A']++;
			} else { // �ҹ��� ����
				arr[str - 'a']++;
			}
			str = System.in.read();
		}
		
		int max = 0;
		int ch = '?' - 'A'; // ��ºκп��� �빮�ڷ� ǥ���ϱ� ����
		
		for(int i=0; i<26; i++) {
			if(arr[i] > max) {
				max = arr[i];
				ch = i;
			} else if(arr[i] == max) {
				ch = '?' - 'A';
			}
		} 
		
		System.out.print((char)(ch+'A'));

	}

}
