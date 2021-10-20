package level10.exam01;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class factorial3 {
	
	// 출저 : https://www.acmicpc.net/problem/10872

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		br.close();
		
		int cal = factorial(N);
		System.out.println(cal);

	}

	private static int factorial(int N) {
		if(N == 0) return 1; // 재귀 종료조건
		return N * factorial(N - 1);
	}

}
