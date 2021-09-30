package level07.exam03;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class search4 {
	
	// ���� : https://www.acmicpc.net/problem/10809

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String S = br.readLine();
		br.close();
		
		// ���� ���ĺ��� ������ ���� �迭 ���� : ���ڿ� S�� �� ������ ��ġ�� ����ų �迭
		int[] arr = new int[26]; 
		
		// �迭�� �ʱ�ȭ ������ �������� ������ -1 �� 
		for(int i=0; i<arr.length; i++) {
			arr[i] = -1;
		}
		
		// �� ���� �˻� : 1. charAt ���ڿ� ���� / 2. ch ������ ���� 
		for(int i=0; i<S.length(); i++) {
			char ch = S.charAt(i);
			
			/* ch ������ ��ġ�� �迭 arr�� ������ ���� : arr[ch-'a'] = i �̴�. (�������� ��ġ�� 0���� ����)
			 * baekjoon :: arr['b'-'a'] = arr['98'-'97'] = arr[1] = 0 (i) 
			 * baekjoon :: arr['a'-'a'] = arr['97'-'97'] = arr[0] = 1 (i) 
			 */
			if(arr[ch - 'a'] == -1) { // ���� ���ڰ� ���� : ó�� ��Ÿ�� ��ġ ǥ�� = arr ���� ���� -1 �� ��� ���Ұ� ���� / -1�� �ƴѰ�� �������� ����
				arr[ch - 'a'] = i;
			}
		}
		
		for(int value : arr) {
			System.out.print(value + " ");
		}
		
	}

}
