package level02.exam03;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class leapYear4 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int year = Integer.parseInt(br.readLine());
		br.close();		
		
		StringBuilder sb = new StringBuilder();
		sb.append((year%4==0) ? ((year%100!=0 || year%400==0) ? "1" : "0") : "0" );
		System.out.println(sb);
		
	}

}
