package level05.exam06;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class OX4 {
	
	// ���� : https://www.acmicpc.net/problem/8958

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		int T = Integer.parseInt(br.readLine()); // �׽�Ʈ���̽�
	
		for(int i=0; i<T; i++) {
			int cnt = 0; // ����Ƚ��
			int sum = 0; // ������
			
			
			// .getByte() :: �Է� ���ڿ��� byte ������ �迭�� ��ȯ�����ִ� �޼ҵ�.
			for(byte value : br.readLine().getBytes()) {
				if(value == 'O') {
					cnt++;	
				} else {
					cnt = 0;
				}
				sum += cnt;
			}
			sb.append(sum).append("\n");
		}
		
		System.out.println(sb);

	}

}