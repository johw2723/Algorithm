package level13.exam07;

import java.util.Scanner;

public class Operator {
	
	// ���� : https://www.acmicpc.net/problem/14888
	public static int N; // �Է� �޴� ���� ����
	public static int[] arr; // ���ڸ� ���� �迭 
	public static int[] operator = new int[4]; // ������ ����
	public static int MAX = Integer.MIN_VALUE; // �ִ� : �� �����ϸ鼭 ����� ���̱� ����
	public static int MIN = Integer.MAX_VALUE; // �ּڰ�
	
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		N = sc.nextInt();
		arr = new int[N];
		
		for(int i=0; i<N; i++) {
			arr[i] = sc.nextInt();
		}
		
		for(int i=0; i<4; i++) {
			operator[i] = sc.nextInt();
		}
		
		sc.close();
		
		dfs(arr[0], 1);
		
		System.out.println(MAX);
		System.out.println(MIN);

	}

	private static void dfs(int num, int idx) {
		if(idx == N) {
			MAX = Math.max(MAX, num); // �� ���� ���ؼ� ū ������ ����
			MIN = Math.min(MIN, num); // �� ���� ���ؼ� ���� ������ ����
			return;
		}
		
		for(int i=0; i<4; i++) {
			// ������ ������ 1�� �̻��� ���
			if(operator[i] > 0) {
				operator[i]--; // �ش� �����ڸ� 1����
				
				switch(i) {
				
				case 0 : dfs(num + arr[idx], idx + 1); break;
				case 1 : dfs(num - arr[idx], idx + 1); break;
				case 2 : dfs(num * arr[idx], idx + 1); break;
				case 3 : dfs(num / arr[idx], idx + 1); break;
				}
				
				// ���ȣ���� ����Ǹ� �ٽ� �ش� ������ ������ �����Ѵ�.
				operator[i]++;
			}
		}
		
	}

}
