package level05.exam01;

import java.util.Arrays;
import java.util.Scanner;

public class min_max {
	
	// ���� : https://www.acmicpc.net/problem/10818
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int[] arr = new int[N];
		
		for(int i=0; i<N; i++) {
			arr[i] = sc.nextInt();		
		}
		
		sc.close();
		Arrays.sort(arr); // Arrays.sort : �迭�� ����� ���Ұ��� ������������ ����
		System.out.println(arr[0]+" "+arr[N-1]);
	}

}
