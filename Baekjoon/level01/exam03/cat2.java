package level01.exam03;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;

public class cat2 {
	
	public static void main(String[] args) throws IOException {
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		bw.write("\\    /\\");
		bw.newLine();
		bw.write(" )  ( ')");
		bw.newLine();
		bw.write("(  /  )");
		bw.newLine();
		bw.write(" \\(__)|");
		
		bw.flush();
		bw.close();
	}

}
