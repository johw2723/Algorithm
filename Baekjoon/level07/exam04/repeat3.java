package level07.exam04;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class repeat3 {
	
	// 출저 : https://www.acmicpc.net/problem/2675

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder(); 
		
		int T = Integer.parseInt(br.readLine());
		
		for(int i=0; i<T; i++) {
			String[] token = br.readLine().split(" ");
			int R = Integer.parseInt(token[0]);
			
			// 알고리즘 간소화 
			for(byte value : token[1].getBytes()) { 
				for(int j=0; j<R; j++) {
					sb.append((char)value);
				}
			}
			sb.append('\n');
		}
		
		System.out.print(sb);

		br.close();

	}

}
