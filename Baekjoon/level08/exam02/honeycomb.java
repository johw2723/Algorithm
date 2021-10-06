package level08.exam02;

import java.util.Scanner;

public class honeycomb {
	
	// ���� : https://www.acmicpc.net/problem/2292

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		sc.close();
		
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
