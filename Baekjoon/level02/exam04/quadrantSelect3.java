package level02.exam04;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class quadrantSelect3 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int a = Integer.parseInt(br.readLine());
		int b = Integer.parseInt(br.readLine());
		br.close();
		
		StringBuilder sb = new StringBuilder();
		
		if(a>0 & b>0) {
			sb.append('1');
		} else if(a<0 & b>0) {
			sb.append('2');
		} else if(a<0 & b<0) {
			sb.append('3');
		} else {
			sb.append('4');
		}
		
		System.out.println(sb);

	}

}
