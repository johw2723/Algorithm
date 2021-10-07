package level08.exam04;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class rise4 {

	// 출저 : https://www.acmicpc.net/problem/2869
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer token = new StringTokenizer(br.readLine()," ");
		br.close();
		
		int A = Integer.parseInt(token.nextToken());
		int B = Integer.parseInt(token.nextToken());
		int V = Integer.parseInt(token.nextToken());
	
		// 5 = 2*(n) - 1(n-1)
		// 5 = 2n - n + 1
		// 4 = n
		// V = An - Bn + B
		// n = (V-B)/(A-B)
		
		int n = (V-B)/(A-B);
		
		if((V-B) % (A - B) != 0) { // 나머지가 있을 경우
			n++;
		}
		System.out.print(n);

	}

}
