package level05.exam05;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class average2 {
	
	// ���� : https://www.acmicpc.net/problem/1546

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		double[] arr = new double[Integer.parseInt(br.readLine())];
		double sum = 0;
		
		// �迭�� �� �ֱ�
		StringTokenizer token = new StringTokenizer(br.readLine()," ");
		
		for(int i=0; i<arr.length; i++) {
			arr[i] = Double.parseDouble(token.nextToken());
		}
		br.close();
		
		// �ִ밪 ���ϱ�
		Arrays.sort(arr); // �迭�� ����� ���� ������������ ����
		double M = arr[arr.length-1];

		
		// ��� ���ϱ�
		for(int i=0; i<arr.length; i++) {
			sum += (arr[i]/M)*100;
		}
		System.out.println(sum/arr.length);
	}

}
