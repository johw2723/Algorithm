package level01.exam10;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.Scanner;

public class remainder4 {

	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
	       
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        
        sc.close();
        
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        bw.write((a+b)%c + "\n");
        bw.write((a%c + b%c)%c + "\n");
        bw.write((a*b)%c + "\n");
        bw.write((a%c * b%c)%c + "\n");
        
        bw.flush();
        bw.close();

	}

}
