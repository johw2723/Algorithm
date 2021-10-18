package level09.exam07;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class escape3 {
	
	// ���� : https://www.acmicpc.net/problem/1085

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer token = new StringTokenizer(br.readLine()," ");
		
		int x = Integer.parseInt(token.nextToken());
		int y = Integer.parseInt(token.nextToken());
		int w = Integer.parseInt(token.nextToken());
		int h = Integer.parseInt(token.nextToken());
		
		// Math.min() : �Է¹��� �ΰ��� �� �� ���� ���� ����
		int x_min = Math.min(x, w-x); // x�� �ּҰŸ�
		int y_min = Math.min(y, h-y); // y�� �ּҰŸ�
		
		// �䱸���� : x�� y�� �� �ּҰŸ�
		System.out.print(Math.min(x_min, y_min));

	}

}
