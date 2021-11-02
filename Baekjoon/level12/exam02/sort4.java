package level12.exam02;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class sort4 {
	
	// ���� : https://www.acmicpc.net/problem/2751

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		
		// list �迭 �� �ϳ��� ����.
		ArrayList<Integer> list = new ArrayList<>();
		
		for(int i=0; i<N; i++) {
			list.add(sc.nextInt());
		}
		
		sc.close();
		
		// Collections.sort() �� Timsort�� �պ� �� �������� �˰����� ����Ѵ�. (hybrid sorting algorithm)
		// �ð����⵵ O(n) ~ O(nlogn)�� �����Ѵٴ� ������ �ִ�.
		// ��� Collections.sort()�� ����Ϸ��� primitive �迭�� �ƴ� List �迭(ArrayList, LinkedList)�� �ڷᱸ���� ����ؼ� �����ؾ��Ѵ�.
		Collections.sort(list);
		
		StringBuilder sb = new StringBuilder();
		
		for(int value : list) {
			sb.append(value).append('\n');
		}

		System.out.print(sb);
		
	}

}
