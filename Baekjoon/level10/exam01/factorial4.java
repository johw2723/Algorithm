package level10.exam01;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class factorial4 {
	
	// ���� : https://www.acmicpc.net/problem/10872

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		br.close();
		
		int cal = 1;
		
		// N�� 0�� �ƴ� �� ���� 1�� �����ϸ鼭 cal�� �ݺ������� ���Ѵ�.
		while(N != 0) {
			cal = cal * N;
			N--;
		}
		
		System.out.println(cal);

	}

}
