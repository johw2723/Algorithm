package level03.exam08;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class a_sum_b4 {
	
	// √‚¿˙ : https://www.acmicpc.net/problem/11022

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		
		String str = " ";
		StringBuilder sb = new StringBuilder();
		
		for(int i=1; i<=N; i++) {
			str = br.readLine();
			int target = str.indexOf(" ");
			int A = Integer.parseInt(str.substring(0, target));
			int B = Integer.parseInt(str.substring(target + 1));
			sb.append("Case #").append(i).append(": ").append(A).append(" + ").append(B).append(" = ").append(A+B).append("\n");
		}
		br.close();
		System.out.print(sb);

	}

}
