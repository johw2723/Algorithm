package level12.exam01;

import java.util.Scanner;

public class sort7 {
	
	// ���� : https://www.acmicpc.net/problem/2750

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		
		/*
		 * range : -1000 ~ 1000
		 * 0�� index[100]�� �ǹ�
		 */
		
		boolean[] arr = new boolean[2001];
		
		for(int i=0; i<N; i++) {
			arr[sc.nextInt() + 1000] = true;
		}
		
		sc.close();
		
		// ���� ������ ���� �ʿ� ����
		
		for(int i=0; i<2001; i++) {
			if(arr[i]) {
				System.out.println(i - 1000);
			}
		}

	}

}
