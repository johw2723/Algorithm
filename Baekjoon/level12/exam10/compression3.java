package level12.exam10;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

public class compression3 {
	
	// 출저 : https://www.acmicpc.net/problem/18870

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		int[] arr = new int[N];
		
		StringTokenizer token = new StringTokenizer(br.readLine()," ");
		for(int i=0; i<N; i++) {
			arr[i] = Integer.parseInt(token.nextToken());
		}
		
		br.close();
		
		int[] sortArr = arr.clone(); // 입력 받은 배열과 정렬된 배열을 구분하기 위한 배열 생성
		Arrays.sort(sortArr);  // 배열 정렬
		
		Map<Integer, Integer> map = new HashMap<>();
		int index = 0;
		for(int i : sortArr) {
			if(!map.containsKey(i)) { // containsKey : hashMap에 있는 메서드로 해당 배열에서 key값이 sortArr[i] 와 같은게 있으면 true 없으면 false 를 반환 
				map.put(i, index++);  // put : hashmap에 배열을 추가하는 메서드로 sortArr[i]를 key로 사용하고 index++ 를 value로 사용
			}
		}
		
		/* 설명 : 입력 예시 2 4 -10 4 -9
		 * sortArr 배열 -10 -9 2 4 4 
		 * 1차 : key 값이 없으므로 key = -10 / value = 0 저장 후 index = 1로 증가 (후위 연산자)
		 * 2차 : key = -9 / value = 1 저장 후 index = 2
		 * 3차 : key = 2 / value = 2 저장 후 index = 3
		 * 4차 : key = 4 / valu = 4 저장 후 index = 4
		 * 5차 : key = 4인 값이 이미 있기 때문에 조건문이 실행되지 않고 반복문 종료
		 */
				
		StringBuilder sb = new StringBuilder();
		for(int i : arr) { // 출력해야 하는 순서는 입력 받은 순서로 한다. 
			sb.append(map.get(i)).append(" "); // get : 해당 key에 있는 value를 가져온다.
		}
		
		System.out.print(sb);

	}

}
