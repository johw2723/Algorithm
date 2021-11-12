package level12.exam10;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class compression {
	
	// 출저 : https://www.acmicpc.net/problem/18870

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		
		int[] arr = new int[N];
		
		for(int i=0; i<N; i++) {
			arr[i] = sc.nextInt();
		}
		
		sc.close();
		
		int[] sortArr = arr.clone(); // temp 배열 생성
		Arrays.sort(sortArr); // 기존 배열 정렬
		
		// 입력 받은 숫자를 서로 비교하여 작을 수를 세는 알고리즘
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
