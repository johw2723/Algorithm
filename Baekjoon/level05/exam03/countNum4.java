package level05.exam03;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class countNum4 {
	
	// √‚¿˙ : https://www.acmicpc.net/problem/2577
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int value = (Integer.parseInt(br.readLine()) * Integer.parseInt(br.readLine()) * Integer.parseInt(br.readLine()));
		br.close();
				
		int[] arr = new int[10];
		
		while(value!=0) {
			arr[value%10]++;
			value/=10;
		}
	
		for(int c : arr) {
			System.out.println(c);
		}
	}
}
