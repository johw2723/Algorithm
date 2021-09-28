package level06.exam03;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class number2 {
	
	// ���� : https://www.acmicpc.net/problem/1065
	
	public static void main(String[] args) throws IOException {
		
		// 1~99 : �������� (1 ~ 9 : �� ��ü�� ���� / 10 ~ 99 �� �ڸ��� ���� ����)
		// 100~1000 : ���� ���ؾ��� ���� ����
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.print(checkSequence(Integer.parseInt(br.readLine())));
		br.close();
		
		
	}
	
	public static int checkSequence(int num) {
		int cnt = 0;
		
		if(num<100) {
			return num;
		} else {
			cnt = 99;
			if(num == 1000) {
				num = 999; // ����ó�� : �ִ밪�� 1000�� ���������� �ƴϱ� ������ ����
			}
			
			for(int i = 100; i<=num; i++) {
				int hun = i/100;
				int ten = (i/10)%10;
				int one = i%10;
				
				if((hun - ten) == (ten - one)) {
					cnt++;
				}
			}
		}
		
		return cnt;
	}

}
