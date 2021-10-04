package level07.exam08;

import java.io.IOException;

public class dial5 {
	
	// √‚¿˙ : https://www.acmicpc.net/problem/5622

	public static void main(String[] args) throws IOException {
		
		int count = 0;
		int temp;
		
		while(true) {
			temp = System.in.read();
			
			if(temp == '\n') {
				break;
			}
			
			if(temp < 'A' ) count += 0;
			else if(temp < 'D') count += 3; // ABC
			else if(temp < 'G') count += 4; // DEF
			else if(temp < 'J') count += 5; // GHI
			else if(temp < 'M') count += 6; // JKL
			else if(temp < 'P') count += 7; // MNO
			else if(temp < 'T') count += 8; // PQRS
			else if(temp < 'W') count += 9; // TUV
			else count += 10; // WXYZ
			
		} 
		System.out.println(count);
		
	}

}
