package level03.exam03;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class forSum3 {

	public static void main(String[] args) throws IOException {
		int N = Integer.parseInt(new BufferedReader(new InputStreamReader(System.in)).readLine());		
		int result = 0;
		
		for(int i=1; i<=N; i++) {result += i;}
		
		System.out.println(result);

	}

}
