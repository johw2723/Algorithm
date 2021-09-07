package level02.exam06;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class mulTable3 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int num = Integer.parseInt(br.readLine());
		br.close();
		
		StringBuilder sb = new StringBuilder();
		
		for(int i=1; i<=9; i++) {
			sb.append(num + " * " + i + " = " + num*i +"\n");
		}
		
		System.out.println(sb);

	}

}
