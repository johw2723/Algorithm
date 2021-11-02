package level12.exam02;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;

public class sort5 {
	
	// 출저 : https://www.acmicpc.net/problem/2751

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		
		// list 계열 중 하나를 쓴다.
		ArrayList<Integer> list = new ArrayList<>();
		
		for(int i=0; i<N; i++) {
			list.add(Integer.parseInt(br.readLine()));
		}
		
		br.close();
		
		// Collections.sort() 는 Timsort로 합병 및 삽입정렬 알고리즘을 사용한다. (hybrid sorting algorithm)
		// 시간복잡도 O(n) ~ O(nlogn)을 보장한다는 장점이 있다.
		// 대신 Collections.sort()를 사용하려면 primitive 배열이 아닌 List 계열(ArrayList, LinkedList)의 자료구조를 사용해서 정렬해야한다.
		Collections.sort(list);
		
		StringBuilder sb = new StringBuilder();
		
		for(int value : list) {
			sb.append(value).append('\n');
		}

		System.out.print(sb);
		
	}

}
