package level11.exam02;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class decomposition3 {

	// ���� : https://www.acmicpc.net/problem/2231
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		// �� �ڸ��� ���� �˱� ���� ���ڿ��� �Է� �� �ޱ�
		String str_N = br.readLine();
		br.close();
		
		// ���� ����
		int N_length = str_N.length();
		int N = Integer.parseInt(str_N);		
		int answer = 0;
		
		for(int i=(N-(N_length*9)); i<N; i++) {
			int number = i;
			int sum = 0; 
			
			while(number != 0) {
				sum += number % 10; // �� �ڸ��� ���ϱ�
				number /= 10;
			}
			
			// i ���� �� �ڸ��� �������� ���� �� (�����ڸ� ã���� ��)
			if(sum + i == N) {
				answer = i;
				break;
			}
		}
		
		System.out.print(answer);

	}

}
