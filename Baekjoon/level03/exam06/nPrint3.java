package level03.exam06;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class nPrint3 {

	public static void main(String[] args) throws IOException {		
		int N = Integer.parseInt(new BufferedReader(new InputStreamReader(System.in)).readLine());
		
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		for(int i=N; i>=1; i--) {
			bw.write(i+"\n");
		}
		bw.flush();
		bw.close();

	}

}