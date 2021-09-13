package level03.exam09;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class printStar3 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		br.close();
		
		StringBuilder sb = new StringBuilder();
		
		for(int i=1; i<=N; i++) {
			sb.append('*');
			System.out.println(sb);
		}

	}

}
