package level11.exam05;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class movie2 {
	
	// ���� : https://www.acmicpc.net/problem/1436

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		br.close();
		
		int num = 666;
		int count = 1;
		
		while(count != N) { // count �� N�� �ٸ��� �´ٸ� num�� ���ڴ� �����ϰ� 1666, 2666 ��� �����. 
			num++;
			
			// contains() :  ���ڿ� �ȿ� �˻��Ϸ��� ���ڿ��� ���ԵǾ� �ִ����� �˻��ϰ� T, F ��ȯ
			if(String.valueOf(num).contains("666")) {
				count++;
			}
		}
		
		System.out.print(num);

	}

}
