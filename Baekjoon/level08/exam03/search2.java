package level08.exam03;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class search2 {
	
	// ���� : https://www.acmicpc.net/problem/1193

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int X = Integer.parseInt(br.readLine());
		br.close();
		
		/*
		 * 1/1 : A case = ������ Ȧ��, ����>=�и� ����, �����
		 * 1/2 2/1 : B case = ������ ¦��, ����<�и� ����, ������
		 * 3/1 2/2 1/3 : A
		 * 1/4 2/3 3/2 4/1 : B
		 * 5/1 4/2 3/3 2/4 1/5 : A 
		 */
		
		int line_count = 1;
		int block_count = 0;
		
		while(true) {
			if(X <= line_count + block_count) {
				if(line_count % 2 == 1) { // �밢���� Ȧ����°�� ��� : ������ ĭ�� ������ Ȧ��
					// ���� : �밢�� ���� - (X��° - ���� ĭ�� �� -1) 
					// �и� : X��° - ���� �밢�������� ��
					System.out.print((line_count - (X - block_count -1)) + "/" + (X - block_count));
					break;
				}
				
				else { // �밢���� ������ ¦��
					System.out.print((X - block_count) + "/" + (line_count - (X - block_count - 1)));
					break;
				}
			} else {
				block_count += line_count;
				line_count++;
			}
		}

	}

}
