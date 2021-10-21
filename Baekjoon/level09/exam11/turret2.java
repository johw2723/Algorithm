package level09.exam11;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class turret2 {
	
	// ���� : https://www.acmicpc.net/problem/1002
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer token;
		int T = Integer.parseInt(br.readLine());
		
		StringBuilder sb = new StringBuilder();
		
		for(int i=0; i<T; i++) {
			token = new StringTokenizer(br.readLine()," ");
			int x1 = Integer.parseInt(token.nextToken());
			int y1 = Integer.parseInt(token.nextToken());
			int r1 = Integer.parseInt(token.nextToken());
			
			int x2 = Integer.parseInt(token.nextToken());
			int y2 = Integer.parseInt(token.nextToken());
			int r2 = Integer.parseInt(token.nextToken());
			
			// �� ���� �߽��� ����, �������� ���� �� : ������ ������ ���� (x1 = x2, y1= y2, r1 = r2)
			// ������ ���� ��, �� �� ������ �Ÿ��� �� ���� �������� �պ��� ū ��� (x2 - x1)�� + (y2 - y1)�� > (r1 + r2)��
			// ������ ���� ��, �� �� �ȿ� �ٸ����� �����鼭 ������ ���� ��� (x2 - x1)�� + (y2 - y1)�� < (r2 - r1)�� 
			// ������ �Ѱ��� ��, ������ �� (x2 - x1)�� + (y2 - y1)�� = (r2 - r1)�� 
			// ������ �Ѱ��� ��, ������ �� (x2 - x1)�� + (y2 - y1)�� = (r2 + r1)�� 
			// �ܴ̿� ������ �ΰ�
			
			// Math.pow(value1, value2) : ������ ����ϴ� �Լ� value1�� value2 ����
			int distance_pow = (int)(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2)); // ������ �Ÿ��� ���� 
			
			// �߽��� �����鼭 �������� ���� ���
			if(x1 == x2 && y1 == y2 && r1 == r2) {
				sb.append(-1).append('\n');
			}
			
			// �� �� ������ �Ÿ��� �� ���� �������� �պ��� ū ���
			else if(distance_pow > Math.pow(r2 + r1, 2)) {
				sb.append(0).append('\n');
			}
			
			// �� �� �ȿ� �ٸ����� �����鼭 ������ ���� ���
			else if(distance_pow < Math.pow(r2 - r1, 2)) {
				sb.append(0).append('\n');
			}
			
			// ������ ��
			else if(distance_pow == Math.pow(r2 - r1, 2)) {
				sb.append(1).append('\n');
			}
			
			// ������ ��
			else if(distance_pow == Math.pow(r2 + r1, 2)) {
				sb.append(1).append('\n');
			}
			
			else {
				sb.append(2).append('\n');
			}
		}
		br.close();
		System.out.println(sb);
	}

}