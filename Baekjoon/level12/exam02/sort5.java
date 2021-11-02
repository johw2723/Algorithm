package level12.exam02;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;

public class sort5 {
	
	// ���� : https://www.acmicpc.net/problem/2751

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		
		// list �迭 �� �ϳ��� ����.
		ArrayList<Integer> list = new ArrayList<>();
		
		for(int i=0; i<N; i++) {
			list.add(Integer.parseInt(br.readLine()));
		}
		
		br.close();
		
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
