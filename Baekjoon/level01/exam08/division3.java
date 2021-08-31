package level01.exam08;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class division3 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		StringTokenizer st = new StringTokenizer(br.readLine()," ");
		double a = Double.parseDouble(st.nextToken());
		double b = Double.parseDouble(st.nextToken());
		
		br.close();
		
		System.out.println(a / b);

	}

}
