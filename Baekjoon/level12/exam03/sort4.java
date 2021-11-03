package level12.exam03;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class sort4 {
	
	// ���� : https://www.acmicpc.net/problem/10989

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		
		int[] cnt = new int[10001];
		
		for(int i=0; i<N; i++) {
			cnt[Integer.parseInt(br.readLine())]++; 
		}
		br.close();
		
		StringBuilder sb = new StringBuilder();
		
		// 0�� �Է� ������ �����Ƿ� 1���� �����Ѵ�.
		for(int i=1; i<10001; i++) {
			// i ���� ������ 0�� �� ������ ��� (�󵵼�)
			while(cnt[i]>0) {
				sb.append(i).append('\n');
				cnt[i]--;
			}
		}
		
		System.out.print(sb);

	}

}
