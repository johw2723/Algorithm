package level03.exam04;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class fastSum3 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		StringBuilder sb = new StringBuilder();
		
		
		for(int i=0; i<N; i++) {
			String str = br.readLine();
			int target = str.indexOf(" ");

			int A = Integer.parseInt(str.substring(0, target));
			int B = Integer.parseInt(str.substring(target + 1));
			
			sb.append(A+B+"\n");
		}
		br.close();
		
		System.out.println(sb);

	}

}
