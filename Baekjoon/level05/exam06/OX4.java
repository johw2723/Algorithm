package level05.exam06;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class OX4 {
	
	// 출저 : https://www.acmicpc.net/problem/8958

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		int T = Integer.parseInt(br.readLine()); // 테스트케이스
	
		for(int i=0; i<T; i++) {
			int cnt = 0; // 연속횟수
			int sum = 0; // 누적합
			
			
			// .getByte() :: 입력 문자열을 byte 단위의 배열로 반환시켜주는 메소드.
			for(byte value : br.readLine().getBytes()) {
				if(value == 'O') {
					cnt++;	
				} else {
					cnt = 0;
				}
				sum += cnt;
			}
			sb.append(sum).append("\n");
		}
		
		System.out.println(sb);

	}

}