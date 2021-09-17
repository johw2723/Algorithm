package level05.exam04;

import java.util.Scanner;

public class remainder {
	
	// 출저 : https://www.acmicpc.net/problem/3052
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		boolean[] arr = new boolean[42]; // 나머지가 나올 수 있는 경우는 0~41 이므로 길이가 42인 배열 생성 
		
		for(int i=0; i<10; i++) {
			arr[sc.nextInt() % 42] = true;
		}
		sc.close();
		
		int count = 0;
		for(boolean value : arr) {
			if(value) {
				count++;
			}
		}
		System.out.println(count);
	}

}
