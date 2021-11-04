package level12.exam04;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class statistics4 {
	
	// ���� : https://www.acmicpc.net/problem/2108

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());

		// �Է°��� ���� : -4000 ~ 4000 
		int[] arr = new int[8001];
		
		int sum = 0;
		int max = Integer.MIN_VALUE;
		int min = Integer.MAX_VALUE;
		int median = 10000;
		int mode = 10000;
		
		for(int i=0; i<N; i++) {
			int temp = Integer.parseInt(br.readLine());
			sum += temp;
			arr[temp + 4000]++;
			
			if(max < temp) {
				max = temp;
			}
			
			if(min > temp) {
				min = temp;
			}
		}
		br.close();
		
		// ��ȸ
		int count = 0;
		int mode_max = 0;
		
		// ������ ������ �ֺ��� 1���� �������� ��� true, �ƴҰ�� false
		boolean flag = false;
		
		for(int i=min+4000; i<=max+4000; i++) {
			
			if(arr[i] > 0) {
				
				// �߾Ӱ� ã�� : ���� Ƚ���� ��ü ������ ���ݿ� �� ��ģ�ٸ�
				if(count < (N+1)/2) {
					count += arr[i];
					median = i-4000;
				}
				
				// �ֺ� ã�� : ���� �ֺ󰪺��� ���� ���� �󵵼��� �� ���� ���
				if(mode_max < arr[i]) {
					mode_max = arr[i];
					mode = i - 4000;
					flag = true;
				}
				// ���� �ֺ� �ִ밪�� ������ ���鼭 �� ���� �ߺ��Ǵ� ���
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
