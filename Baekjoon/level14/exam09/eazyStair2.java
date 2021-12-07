package level14.exam09;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class eazyStair2 {
	
	// ���� : https://www.acmicpc.net/problem/10844

	public static Long[][] dp; // �ڸ����� 100 ���� �־����� longŸ��
	final static long MOD = 1000000000;
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		br.close();
		
		dp = new Long[N+1][10];
		
		// ù��° �ڸ����� 1�� �ʱ�ȭ
		for(int i=0; i<10; i++) {
			dp[1][i] = 1L;
		}
		
		long result = 0;
		
		// ������ �ڸ����� 1~9 ������ ����� ���� ��� �����ش�.
		for(int i=1; i<=9; i++) {
			result += count(N, i);
		}
		
		System.out.println(result%MOD);

	}

	private static long count(int digit, int value) {
		// ù ��° �ڸ����� �����Ѵٸ� �� �̻� Ž���� �ʿ䰡 ����
		if(digit == 1) {
			return dp[digit][value];
		}
		
		// �ش� �ڸ����� value���� ���� Ž������ ���� ���
		if(dp[digit][value] == null) {
			// value = 0 �� ��, ������ 1 �ۿ� ���´�.
			if(value == 0) {
				dp[digit][value] = count(digit-1, 1);
			}
			// value = 9 �� ��, ������ 8 �ۿ� ���´�.
			else if(value == 9) {
				dp[digit][value] = count(digit-1, 8);
			}
			// �׿� value-1�� value+1�� ���Ѱ��� ����� ���� �ȴ�.
			else {
				dp[digit][value] = count(digit-1, value-1) + count(digit-1, value+1);
			}
		}
		return dp[digit][value]%MOD;
	}

}
