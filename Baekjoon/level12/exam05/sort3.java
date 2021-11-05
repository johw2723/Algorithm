package level12.exam05;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class sort3 {
	
	// √‚¿˙ : https://www.acmicpc.net/problem/1427

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine();
		br.close();
		
		int[] counting = new int[10];
		
		for(int i=0; i<str.length(); i++) {
			counting[str.charAt(i) - '0']++;
		}
		
		for(int i=9; i>=0; i--) {
			while(counting[i]-- > 0) {
				System.out.print(i);
			}
		}
	}

}
