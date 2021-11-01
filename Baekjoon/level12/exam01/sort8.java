package level12.exam01;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class sort8 {
	
	// ���� : https://www.acmicpc.net/problem/2750

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		
		/*
		 * range : -1000 ~ 1000
		 * 0�� index[100]�� �ǹ�
		 */
		
		boolean[] arr = new boolean[2001];
		
		for(int i=0; i<N; i++) {
			arr[Integer.parseInt(br.readLine()) + 1000] = true;
		}
		
		br.close();
		
		// ���� ������ ���� �ʿ� ����
		
		for(int i=0; i<2001; i++) {
			if(arr[i]) {
				System.out.println(i - 1000);
			}
		}

	}

}
