package level01.exam11;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class threeDigits7 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));	
			
		int a = Integer.parseInt(br.readLine());
		int b = Integer.parseInt(br.readLine());
		
		cal(a, b);
		
		br.close();
		
	}

	private static void cal(int a, int b) {
		int temp = b;
		StringBuilder sb = new StringBuilder();
		while(temp>0) {
			sb.append(a * (temp%10));
			sb.append('\n');
			temp /= 10;
		}
		sb.append(a * b);
		System.out.println(sb);
	}

}
