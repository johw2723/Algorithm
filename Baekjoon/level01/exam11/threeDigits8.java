package level01.exam11;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class threeDigits8 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));	
			
		int a = Integer.parseInt(br.readLine());
		String b = br.readLine();
		
		cal(a, b);
		
		br.close();
		
	}

	private static void cal(int a, String b) {
		StringBuilder sb = new StringBuilder();
		for(int i=b.length()-1; i>=0; i--) {
			sb.append(a * (b.charAt(i)-'0'));
			sb.append('\n');
		}
		sb.append(a * Integer.parseInt(b));
		System.out.println(sb);
	}

}
