package level05.exam04;

import java.util.Scanner;

public class remainder {
	
	// ���� : https://www.acmicpc.net/problem/3052
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		boolean[] arr = new boolean[42]; // �������� ���� �� �ִ� ���� 0~41 �̹Ƿ� ���̰� 42�� �迭 ���� 
		
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
