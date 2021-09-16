package level05.exam01;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class min_max4 {
	
	// ���� : https://www.acmicpc.net/problem/10818
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		Integer.parseInt(br.readLine()); // �Է¸� �ް� ��� ����
		StringTokenizer token = new StringTokenizer(br.readLine()," ");
		br.close();
		
		// ���õ� �Է°� : ��� ������ -1,000,000���� ũ�ų� ����, 1,000,000���� �۰ų� ���� �����̴�.
		int min = 1000001;	
		int max = -1000001;
		
		while(token.hasMoreElements()) { // hasMoreElements() : StringTokenizer�� ��ū�� ���� ������ true ���� �����Ѵ�.		
			int value = Integer.parseInt(token.nextToken());	
			if(value>max) {
				max = value;
			} else if(value<min) {
				min = value;
			}
		}
		
		System.out.println(min+" "+max);
	}

}
