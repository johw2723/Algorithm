package level07.exam07;

import java.io.IOException;

public class reverse4 {

	public static void main(String[] args) throws IOException {
		int A = (System.in.read() - '0') + ((System.in.read() - '0')*10) + ((System.in.read() - '0')*100);
		
		System.in.read(); // ���� ó��
		
		int B = (System.in.read() - '0') + ((System.in.read() - '0')*10) + ((System.in.read() - '0')*100);
		
		System.out.print(A > B ? A : B); // ���׿����� ������� �ڵ� ���̱�

	}

}
