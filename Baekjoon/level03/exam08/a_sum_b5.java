package level03.exam08;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class a_sum_b5 {
	
	// √‚¿˙ : https://www.acmicpc.net/problem/11022

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		
		String str = " ";
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		for(int i=1; i<=N; i++) {
			str = br.readLine();
			int target = str.indexOf(" ");
			int A = Integer.parseInt(str.substring(0, target));
			int B = Integer.parseInt(str.substring(target + 1));
			bw.write("Case #"+i+": "+A+" + "+B+" = "+(A+B)+"\n");
		}
		br.close();
		bw.flush();
		bw.close();

	}

}
