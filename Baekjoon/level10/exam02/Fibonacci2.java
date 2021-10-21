package level10.exam02;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Fibonacci2 {
	
	// 출저 : https://www.acmicpc.net/problem/10870

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		br.close();
		
		int[] fibonacci = new int [N+1]; // 0부터 시작하므로
		
		for(int i=0; i<fibonacci.length; i++) {
			if(i == 0) fibonacci[0] = 0;
			else if(i == 1) fibonacci[1] = 1;
			else fibonacci[i] = fibonacci[i-1] + fibonacci[i-2];
		}
		
		System.out.print(fibonacci[N]);

	}

}
