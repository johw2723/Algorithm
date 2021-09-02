package level01.exam11;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class threeDigits6 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));	
			
		int a = Integer.parseInt(br.readLine());
		int b = Integer.parseInt(br.readLine());
		
		br.close();
		
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		bw.write((a * (b%10)) + "\n");
		bw.write((a * (b%100/10)) + "\n");
		bw.write((a * (b/100)) + "\n");
		bw.write((a * b) + "\n");
        
        bw.flush();
        bw.close();
	}

}
