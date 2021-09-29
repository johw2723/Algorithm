package level07.exam02;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class numberSum3 {
	
	// ���� : https://www.acmicpc.net/problem/11720

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		br.readLine(); // �Է� 1 : ������ ���� N�� �ʿ�� ���� �����Ƿ� �Է¸� �޴´�.
		String str = br.readLine(); // �Է� 2 : ������� �־��� ���� N�� 
		br.close();
		int sum = 0;
		
		for(byte value : str.getBytes()) {
			sum += (value - '0');
		}
		
		System.out.print(sum);

	}

}
