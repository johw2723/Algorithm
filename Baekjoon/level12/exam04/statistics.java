package level12.exam04;

import java.util.Arrays;
import java.util.Scanner;

public class statistics {
	
	// ���� : https://www.acmicpc.net/problem/2108

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int[] arr = new int[N];
		int sum = 0;
		
		for(int i=0; i<N; i++) {
			arr[i] = sc.nextInt();
			sum += arr[i];
		}
		sc.close();
		
		Arrays.sort(arr);
		
		
		// �ֺ� ���ϱ�
		boolean flag = false;
		int mode_max = 0;
		int mode = 10000;
		
		for(int i=0; i<N; i++) {
			int jump = 0; // ������ ���� ���¸�ŭ i���� jump��ų ����
			int count = 1;
			int i_value = arr[i];
			
			for(int j=i+1; j<N; j++) {
				if(i_value != arr[j]) {
					break;
				}
				count++;
				jump++;
			}
			
			if(count > mode_max) {
				mode_max = count;
				mode = i_value;
				flag = true;
			}
			else if(count == mode_max && flag == true) {
				mode = i_value;
				flag = false;
			}
			
			i += jump;
		}
			
		System.out.println((int)Math.round((double)sum/N));
		System.out.println(arr[N/2]);
		System.out.println(mode);
		System.out.println(arr[N-1] - arr[0]);

	}

}