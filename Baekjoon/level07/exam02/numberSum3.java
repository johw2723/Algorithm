package level07.exam02;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class numberSum3 {
	
	// 출저 : https://www.acmicpc.net/problem/11720

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		br.readLine(); // 입력 1 : 숫자의 개수 N은 필요로 하지 않으므로 입력만 받는다.
		String str = br.readLine(); // 입력 2 : 공백없이 주어진 숫자 N개 
		br.close();
		int sum = 0;
		
		for(byte value : str.getBytes()) {
			sum += (value - '0');
		}
		
		System.out.print(sum);

	}

}
