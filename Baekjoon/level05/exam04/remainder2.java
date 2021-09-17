package level05.exam04;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class remainder2 {
	
	// 출저 : https://www.acmicpc.net/problem/3052
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		boolean[] arr = new boolean[42]; // 나머지가 나올 수 있는 경우는 0~41 이므로 길이가 42인 배열 생성 
		
		for(int i=0; i<10; i++) {
			arr[Integer.parseInt(br.readLine()) % 42] = true;
		}
		br.close();
		
		int count = 0;
		for(boolean value : arr) {
			if(value) {
				count++;
			}
		}
		System.out.println(count);
	}

}
