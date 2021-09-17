package level05.exam03;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class countNum2 {
	
	// √‚¿˙ : https://www.acmicpc.net/problem/2577
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int value = (Integer.parseInt(br.readLine()) * Integer.parseInt(br.readLine()) * Integer.parseInt(br.readLine()));
		br.close();
				
		String st = Integer.toString(value);
		
		for(int i=0; i<10; i++) {
			int count = 0;
			for(int j=0; j<st.length(); j++) {
				if((st.charAt(j) - '0')==i) {
					count++;
				}
			}
			System.out.println(count);
		}
	}
}
