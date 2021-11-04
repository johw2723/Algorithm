package level12.exam04;

import java.util.Scanner;

public class statistics3 {
	
	// ���� : https://www.acmicpc.net/problem/2108

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		
		// �Է°��� ���� : -4000 ~ 4000 (������ ���밪�� 4000�� ���� ����)
		int[] arr = new int[8001];
		int sum = 0;
		int max = Integer.MIN_VALUE; // �ִ� : ���� ���������� ū ���� ���ϹǷ�
		System.out.println("max : " + max);
		int min = Integer.MAX_VALUE; // �ּڰ�
		System.out.println("min : " + min);
		
		// �߾Ӱ��� �ֺ��� -4000~4000�� ������ ���� �ʱ�ȭ
		int median = 10000; // �߾Ӱ�
		int mode = 10000;  // �ֺ�
		
		for(int i=0; i<N; i++) {
			int temp = sc.nextInt();
			sum += temp;
			arr[temp + 4000]++;
			
			if(max < temp) {
				max = temp;
				System.out.println("max" + i +" : " + max);
			}
			if(min > temp) {
				min = temp;
				System.out.println("min" + i +" : " + min);
			}
		}
		sc.close();
		
		System.out.println("max_end : " + max);
		System.out.println("min_end : " + min);
		
		// ��ȸ
		int count = 0; // �߾Ӱ� �� ���� ��
		int mode_max = 0; // �ֺ��� �ִ�
		
		// ������ ������ �ֺ��� 1���� �������� ��� true, �ƴҰ�� false
		boolean flag = false;
		
		for(int i=min+4000; i<=max+4000; i++) {
			
			if(arr[i]>0) {
				
				// �߾Ӱ� ã�� : ����Ƚ���� ��ü ������ ���ݿ� �� ��ģ�ٸ�
				if(count < (N+1) / 2) {
					count += arr[i]; // i���� �󵵼��� count�� ����
					median = i-4000;
				}
				
				// �ֺ� ã�� : ���� �ֺ󰪺��� ���� ���� �󵵼��� �� ���� ���
				if(mode_max < arr[i]) {
					mode_max = arr[i];
					mode = i-4000;
					flag = true; // ù �����̹Ƿ� true�� ����
				}
				// ���� �ֺ� �ִ񰪰� ������ ����̸鼭 �� ���� �ߺ��Ǵ� ���
				else if(mode_max == arr[i] && flag == true) {
					mode = i-4000;
					flag = false;
				}			
			}
		}
			
		System.out.println((int)Math.round((double)sum/N));
		System.out.println(median);
		System.out.println(mode);
		System.out.println(max - min);

	}

}
