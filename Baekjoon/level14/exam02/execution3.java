package level14.exam02;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class execution3 {
	
	// 출저 : https://www.acmicpc.net/problem/9184
	// 함수 w에서 a, b, c 값이 20이 넘어가면 w(20, 20, 20)을 호출하기에 크기는 21을 넘지않는다.
	static int[][][] dp = new int[21][21][21]; 

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		StringTokenizer token;
		while(true) {
			token = new StringTokenizer(br.readLine()," ");
			int a = Integer.parseInt(token.nextToken());
			int b = Integer.parseInt(token.nextToken());
			int c = Integer.parseInt(token.nextToken());
			
			if(a==-1 && b==-1 && c==-1) {
				break;
			}
			sb.append("w(" + a + ", " + b + ", " + c + ") = ").append(w(a,b,c)).append('\n');
			
		}		
		br.close();
		System.out.print(sb);
	}

	static int w(int a, int b, int c) {
		// a, b, c가 범위를 벗어나지 않으면서 메모이제이션이 되어있는 경우
		if(inRange(a, b, c) && dp[a][b][c] != 0) {
			return dp[a][b][c];
		}
		
		if (a <= 0 || b <= 0 || c <= 0) {
			return 1;
		}

		if(a > 20 || b > 20 || c > 20) {
			return dp[20][20][20] = w(20, 20, 20);
		}

		if(a < b && b < c) {
			return dp[a][b][c] = w(a, b, c - 1) + w(a, b - 1, c - 1) - w(a, b - 1, c);
		}
		   
		return dp[a][b][c] = w(a - 1, b, c) + w(a - 1, b - 1, c) + w(a - 1, b, c - 1) - w(a - 1, b - 1, c - 1);
		
	}

	// IndexOutOfBoundException 에러 방지를 위한 메소드
	static boolean inRange(int a, int b, int c) {
		return 0 <= a && a <= 20 && 0 <= b && b <= 20 && 0 <= c && c <= 20;
	}

}
