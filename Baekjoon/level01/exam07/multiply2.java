package level01.exam07;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class multiply2 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String[] str = br.readLine().split(" ");
		int a = Integer.parseInt(str[0]);
		int b = Integer.parseInt(str[1]);
		
		br.close();
		System.out.println(a * b);
	}
	
}