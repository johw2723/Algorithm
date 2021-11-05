package level12.exam05;

import java.io.IOException;
import java.io.InputStream;

public class sort5 {
	
	// ���� : https://www.acmicpc.net/problem/1427

	public static void main(String[] args) throws IOException {
		InputStream in = System.in; // ����Ʈ ������ �о���δ�.
		
		int[] counting = new int[10];
		int temp;
		
		while((temp = in.read()) != '\n') {
			counting[temp - '0']++;
		}
		
		for(int i=9; i>=0; i--) {
			while(counting[i]-- > 0) {
				System.out.print(i);
			}
		}
	}

}
