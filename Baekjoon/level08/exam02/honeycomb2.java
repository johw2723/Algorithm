package level08.exam02;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class honeycomb2 {
	
	// ���� : https://www.acmicpc.net/problem/2292

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		br.close();
		
		/* 1 
		 * 2~7 : 6 = (1*6)
		 * 8~19 : 12 = (2*6)
		 * 20~37 : 18 = (3*6)
		 */
		int count = 1; 
		int range = 2; // ���� : �ּڰ� 2 ���� ����
		
		if(N==1) {
			System.out.print(1);
		} else {
			while(range <= N) { // ������ N���� Ŀ���� �������� �ݺ�
				range = range + (count * 6);
				count++;
			}
			System.out.print(count);
		}	

	}

}
