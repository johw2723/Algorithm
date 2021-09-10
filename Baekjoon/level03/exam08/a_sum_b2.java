package level03.exam08;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class a_sum_b2 {
	
	// √‚¿˙ : https://www.acmicpc.net/problem/11022

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		
		String str = " ";
		for(int i=1; i<=N; i++) {
			str = br.readLine();
			int target = str.indexOf(" ");
			int A = Integer.parseInt(str.substring(0, target));
			int B = Integer.parseInt(str.substring(target + 1));
			System.out.println("Case #"+i+": "+A+" + "+B+" = " +(A+B));
		}
		br.close();

	}

}
