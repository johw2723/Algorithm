package level01.exam10;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class remainder5 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        StringTokenizer st = new StringTokenizer(br.readLine()," ");
        br.close();
        
        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());
        int c = Integer.parseInt(st.nextToken());
        
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        bw.write((a+b)%c + "\n");
        bw.write((a%c + b%c)%c + "\n");
        bw.write((a*b)%c + "\n");
        bw.write((a%c * b%c)%c + "\n");
        
        bw.flush();
        bw.close();

	}

}
