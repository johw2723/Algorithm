package level01.exam11;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class threeDigits5 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));	
			
		int a = Integer.parseInt(br.readLine());
		int b = Integer.parseInt(br.readLine());
		
		br.close();
		
		StringBuilder sb = new StringBuilder();
		
		sb.append((a * (b%10)) + "\n");
        sb.append((a * (b%100/10)) + "\n");
        sb.append((a * (b/100)) + "\n");
        sb.append((a * b) + "\n");
        
        System.out.println(sb);   
	}

}
