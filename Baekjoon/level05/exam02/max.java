package level05.exam02;

import java.util.Scanner;

public class max {
	
	// ���� : https://www.acmicpc.net/problem/2562

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] arr = new int[9];
		
		int count = 0;
		int max = 0;
		int index = 0;
		
		// �迭 ä���
		for(int i=0; i<9; i++) {
			arr[i] = sc.nextInt();
		}
		sc.close();
		
		// ����
		for(int value : arr) {
			count++;
			
			if(value>max) {
				max = value;
				index = count;
			}
		}
		
		System.out.println(max + "\n" + index);

	}

}
