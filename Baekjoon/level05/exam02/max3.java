package level05.exam02;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class max3 {
	
	// 출저 : https://www.acmicpc.net/problem/2562

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int max = 0;
		int index = 0;
		
		// 로직
		for(int i =0; i<9; i++) {
			int value = Integer.parseInt(br.readLine());
			
			if(value>max) {
				max = value;
				index = i+1;
			}
		}
		
		System.out.println(max + "\n" + index);

	}

}
