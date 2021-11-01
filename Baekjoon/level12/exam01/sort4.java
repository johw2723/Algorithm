package level12.exam01;

import java.util.Arrays;
import java.util.Scanner;

public class sort4 {
	
	// ���� : https://www.acmicpc.net/problem/2750

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		
		int[] arr = new int[N];
		
		for(int i=0; i<N; i++) {
			arr[i] = sc.nextInt();
		}
		
		sc.close();
		
		// Arrays.sort �޼ҵ� : �ڹٿ��� ���� �������ִ� ���� �޼ҵ�� sort()�ȿ� �迭�� ������ �ڵ����� �迭�� ���ĵǾ�´�.
		// dual-pivot Quicksort �˰������� �ð����⵵�� ��� O(nlogn)���� �������ĺ��� ���� ������ ���� 
		Arrays.sort(arr);
		
		for(int value : arr) {
			System.out.println(value);
		}

	}

}
