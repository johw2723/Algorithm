package level12.exam02;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class sort6 {
	
	// ���� : https://www.acmicpc.net/problem/2751

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		
		// -1000000 ~ 1000000 , ������ 0 = index 100000 ���� ����
		boolean[] arr = new boolean[2000001];
		
		for(int i=0; i<N; i++) {
			arr[Integer.parseInt(br.readLine()) + 1000000] = true;
		}
		
		br.close();
		
		StringBuilder sb = new StringBuilder();
		
		for(int i=0; i<arr.length; i++) {
			if(arr[i]) {
				sb.append((i - 1000000)).append('\n');
			}
		}

		System.out.print(sb);
		
	}

}