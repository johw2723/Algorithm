package level12.exam01;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class sort8 {
	
	// 출저 : https://www.acmicpc.net/problem/2750

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		
		/*
		 * range : -1000 ~ 1000
		 * 0은 index[100]을 의미
		 */
		
		boolean[] arr = new boolean[2001];
		
		for(int i=0; i<N; i++) {
			arr[Integer.parseInt(br.readLine()) + 1000] = true;
		}
		
		br.close();
		
		// 정렬 과정이 따로 필요 없음
		
		for(int i=0; i<2001; i++) {
			if(arr[i]) {
				System.out.println(i - 1000);
			}
		}

	}

}
