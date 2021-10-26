package level11.exam02;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class decomposition3 {

	// 출저 : https://www.acmicpc.net/problem/2231
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		// 몇 자릿수 인지 알기 위한 문자열로 입력 값 받기
		String str_N = br.readLine();
		br.close();
		
		// 변수 설정
		int N_length = str_N.length();
		int N = Integer.parseInt(str_N);		
		int answer = 0;
		
		for(int i=(N-(N_length*9)); i<N; i++) {
			int number = i;
			int sum = 0; 
			
			while(number != 0) {
				sum += number % 10; // 각 자리수 더하기
				number /= 10;
			}
			
			// i 값과 각 자리수 누적합이 같을 때 (생성자를 찾았을 때)
			if(sum + i == N) {
				answer = i;
				break;
			}
		}
		
		System.out.print(answer);

	}

}
