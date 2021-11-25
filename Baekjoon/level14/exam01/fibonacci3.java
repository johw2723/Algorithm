package level14.exam01;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class fibonacci3 {
	
	// ���� : https://www.acmicpc.net/problem/1003
	// ������ȹ�� : Dynamic Programming (DP)
	// '� �־��� ������ ���������� �ɰ��� Ǯ����� �־� �ݺ��Ǵ� ȣ���� ���̴� ���'
	public static Integer[][] dp = new Integer[41][2]; // N�� 40���� �۰ų� ���� �ڿ��� �Ǵ� 0
	public static StringBuilder sb = new StringBuilder();
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		dp[0][0] = 1; // N=0 �� ���� 0 ȣ�� Ƚ��
		dp[0][1] = 0; // N=0 �� ���� 1 ȣ�� Ƚ��
		dp[1][0] = 0; // N=1 �� ���� 0 ȣ�� Ƚ��
		dp[1][1] = 1; // N=1 �� ���� 1 ȣ�� Ƚ��
		
		int T = Integer.parseInt(br.readLine());
		
		while(T--> 0) {
			int N = Integer.parseInt(br.readLine());
			fibonacci(N);
			sb.append(dp[N][0]).append(' ').append(dp[N][1]).append('\n');
		}
		
		br.close();
		System.out.print(sb);
		
	}

	private static Integer[] fibonacci(int N) {
		// N�� ���� 0, 1�� ȣ�� Ƚ���� ���� ��(Ž������ ���� ���� ��)
		if(dp[N][0] == null || dp[N][1] == null) {
			// �� N�� ���� 0 ȣ�� Ƚ���� 1 ȣ�� Ƚ���� ���ȣ���Ѵ�.
			dp[N][0] = fibonacci(N-1)[0] + fibonacci(N-2)[0];
			dp[N][1] = fibonacci(N-1)[1] + fibonacci(N-2)[1];
		}
		// N�� ���� 0�� 1, �� [N][0]�� [N][1] �� ����ִ� [N]�� ��ȯ�Ѵ�.
		return dp[N];
	}

}
