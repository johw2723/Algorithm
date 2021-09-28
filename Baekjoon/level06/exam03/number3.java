package level06.exam03;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class number3 {
	
	// ���� : https://www.acmicpc.net/problem/1065
	
	public static void main(String[] args) throws IOException {
		
		// 1~99 : �������� (1 ~ 9 : �� ��ü�� ���� / 10 ~ 99 �� �ڸ��� ���� ����)
		// 100~1000 : ���� ���ؾ��� ���� ����
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		int cnt = 0;
		
		if(N<100) {
			cnt = N;
		} else {
			cnt = 99;
			if(N == 1000) {
				N = 999;
			}
			
			for(int i=100; i<=N; i++) {
				int hun = i/100;
				int ten = (i/10)%10;
				int one = i%10;
				
				if((hun - ten) == (ten - one)) {
					cnt++;
				}
			}
		}
		
		System.out.print(cnt);;
		
		br.close();
		
		
	}
	
}
