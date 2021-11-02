package level12.exam02;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class sort7 {
	
	// ���� : https://www.acmicpc.net/problem/2751
	
	private final static int[] gap = 
		{ 1, 4, 10, 23, 57, 132, 301, 701, 1750, 3937, 	
		8858, 19930, 44842, 100894, 227011, 510774,
		1149241, 2585792, 5818032, 13090572, 29453787, 
		66271020, 149109795, 335497038, 754868335, 1698453753};	// ���� ����ִ� �迭	

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		
		int[] arr = new int[N];
		
		for(int i=0; i<N; i++) {
			arr[i] = Integer.parseInt(br.readLine());
		}
		
		br.close();
		
		shell_sort(arr, arr.length);
		
		StringBuilder sb = new StringBuilder();
		
		for(int value : arr) {
			sb.append(value).append('\n');
		}
		
		System.out.println(sb);
		
	}
	
	// �� ó�� gap�� ���� �� �ε����� ���ϴ� �޼ҵ�
	private static int getGap(int length) {
		int index = 0;
		// �ּ��� �κ� �迭�� ���Ұ� 2������ �� �ǵ��� �����ش�.
		int len = (int)(length / 2.25);	
		while (gap[index] <= len) {
			index++;
		}
		return index;
	}

	private static void shell_sort(int[] a, int size) {
		int index = getGap(size);	// ù gap�� ����� index
		 
		// gap[index] ������ gap[0] ���� �ݺ��Ѵ�.
		for (int i = index; i >= 0; i--) {
 
			for (int j = 0; j < gap[i]; j++) {	// �� �κ� ����Ʈ�� ���� ���������� �Ѵ�.
				insertion_sort(a, i, size, gap[i]);
			}
		}		
	}

	private static void insertion_sort(int[] a, int start, int size, int gap) {
		// �κ� �迭�� �� ��° ���Һ��� size���� �ݺ��Ѵ�. (gap ���� �ǳʶ�) 
		for (int i = start + gap; i < size; i += gap) {
		 
			int target = a[i];
			int j = i - gap;
		 
			// Ÿ�� ���Ұ� ������ ���Һ��� ���� �� ���� �ݺ� 
			while (j >= start && target < a[j]) {			
				a[j + gap] = a[j];	// ���� ���Ҹ� �� ĭ�� �ڷ� �̷��.
				j -= gap;
			}
			/*
			 * �� �ݺ������� Ż�� �ϴ� ��� ���� ���Ұ� Ÿ�ٺ��� �۴ٴ� �ǹ��̹Ƿ�
			 * Ÿ�� ���Ҵ� j��° ���� �ڿ� �;��Ѵ�.
			 * �׷��Ƿ� Ÿ���� j + gap �� ��ġ�ϰ� �ȴ�.
			 */
			a[j + gap] = target;
		 
		}
		
	}

}
