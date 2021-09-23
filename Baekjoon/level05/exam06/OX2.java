package level05.exam06;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class OX2 {
	
	// 출저 : https://www.acmicpc.net/problem/8958

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] arr = new String[Integer.parseInt(br.readLine())];
		
		// 배열에 테스트케이스 넣기
		for(int i=0; i<arr.length; i++) {
			arr[i] = br.readLine();
		}
		br.close();
		
		for(int i=0; i<arr.length; i++) {
			int cnt = 0; // 연속횟수
			int sum = 0; // 누적합
			
			for(int j=0; j<arr[i].length(); j++) {
				if(arr[i].charAt(j) == 'O') {
					cnt++;
				} else {
					cnt = 0;
				}
				sum += cnt;
			}
			
			System.out.println(sum);
		}

	}

}
