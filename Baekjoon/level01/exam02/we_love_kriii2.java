package level01.exam02;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;

public class we_love_kriii2 {

	public static void main(String[] args) throws IOException {
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		bw.write("����ģ�� ��������");
		bw.newLine();
		bw.write("����ģ�� ��������");
		bw.flush();
		bw.close();
	}
}
