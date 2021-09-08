package level03.exam03;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class forSum2 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		br.close();
		
		int result = 0;
		
		for(int i=1; i<=N; i++) {
			result += i;
		}
		
		System.out.println(result);

	}

}
