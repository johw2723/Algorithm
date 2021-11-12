package level12.exam10;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class compression {
	
	// ���� : https://www.acmicpc.net/problem/18870

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		
		int[] arr = new int[N];
		
		for(int i=0; i<N; i++) {
			arr[i] = sc.nextInt();
		}
		
		sc.close();
		
		int[] sortArr = arr.clone(); // temp �迭 ����
		Arrays.sort(sortArr); // ���� �迭 ����
		
		// �Է� ���� ���ڸ� ���� ���Ͽ� ���� ���� ���� �˰���
		Map<Integer, Integer> map = new HashMap<>();
		int index = 0;
		for(int n : sortArr) {
			if(!map.containsKey(n)) {
				map.put(n, index++);
			}
		}
		
		for(int n : arr) {
			System.out.print(map.get(n) + " ");
		}

	}

}
