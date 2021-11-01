package level12.exam01;

import java.util.Scanner;

public class sort7 {
	
	// 출저 : https://www.acmicpc.net/problem/2750

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		
		/*
		 * range : -1000 ~ 1000
		 * 0은 index[100]을 의미
		 */
		
		boolean[] arr = new boolean[2001];
		
		for(int i=0; i<N; i++) {
			arr[sc.nextInt() + 1000] = true;
		}
		
		sc.close();
		
		// 정렬 과정이 따로 필요 없음
		
		for(int i=0; i<2001; i++) {
			if(arr[i]) {
				System.out.println(i - 1000);
			}
		}

	}

}
