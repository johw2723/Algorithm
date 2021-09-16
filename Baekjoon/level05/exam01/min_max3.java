package level05.exam01;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class min_max3 {
	
	// ���� : https://www.acmicpc.net/problem/10818
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		int[] arr = new int[N];
		
		StringTokenizer token = new StringTokenizer(br.readLine()," ");
		br.close();
		
		int index = 0;
		
		while(token.hasMoreElements()) { // hasMoreElements() : StringTokenizer�� ��ū�� ���� ������ true ���� �����Ѵ�.		
			arr[index] = Integer.parseInt(token.nextToken());	
			index++;
		}
				
		Arrays.sort(arr); // Arrays.sort : �迭�� ����� ���Ұ��� ������������ ����
		System.out.println(arr[0]+" "+arr[N-1]);
	}

}
