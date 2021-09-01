package level01.exam09;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.Scanner;

public class calculation4 {
	
	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        
        sc.close();
        
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        bw.write((a+b) + "\n");
        bw.write((a-b) + "\n");
        bw.write((a*b) + "\n");
        bw.write((a/b) + "\n");
        bw.write((a%b) + "\n");
        
        bw.flush();
        bw.close();
	}
}
