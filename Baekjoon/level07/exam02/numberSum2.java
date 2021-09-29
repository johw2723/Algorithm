package level07.exam02;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class numberSum2 {
	
	// ���� : https://www.acmicpc.net/problem/11720

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		String str = br.readLine();
		br.close();
		int sum = 0;
		
		for(int i=0; i<N; i++) {
			sum += str.charAt(i) - '0';
		}
		
		System.out.print(sum);

	}

}