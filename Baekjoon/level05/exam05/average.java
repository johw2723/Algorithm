package level05.exam05;

import java.util.Arrays;
import java.util.Scanner;

public class average {
	
	// ���� : https://www.acmicpc.net/problem/1546

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double[] arr = new double[sc.nextInt()];
		double sum = 0;
		
		// �迭�� �� �ֱ�
		for(int i=0; i<arr.length; i++) {
			arr[i] = sc.nextDouble();
		}
		sc.close();
		
		// �ִ밪 ���ϱ�
		Arrays.sort(arr); // �迭�� ����� ���� ������������ ����
		double M = arr[arr.length-1];

		
		// ��� ���ϱ�
		for(int i=0; i<arr.length; i++) {
			sum += (arr[i]/M)*100;
		}
		System.out.println(sum/arr.length);
	}

}
