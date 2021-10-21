package level10.exam01;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class factorial4 {
	
	// 출저 : https://www.acmicpc.net/problem/10872

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		br.close();
		
		int cal = 1;
		
		// N이 0이 아닐 때 까지 1씩 감소하면서 cal에 반복적으로 곱한다.
		while(N != 0) {
			cal = cal * N;
			N--;
		}
		
		System.out.println(cal);

	}

}
