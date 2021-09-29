package level07.exam01;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ASCII3 {
	
	// √‚¿˙ : https://www.acmicpc.net/problem/11654

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int ascii = br.read();
		br.close();
		System.out.println(ascii);

	}

}
