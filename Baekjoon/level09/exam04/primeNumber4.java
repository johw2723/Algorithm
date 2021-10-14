package level09.exam04;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class primeNumber4 {
	
	// 출저 : https://www.acmicpc.net/problem/1929

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));		
		StringTokenizer token = new StringTokenizer(br.readLine()," ");
		br.close();
		
		int M = Integer.parseInt(token.nextToken());
		int N = Integer.parseInt(token.nextToken());
		
		StringBuilder sb = new StringBuilder();
		boolean[] prime = new boolean[N+1];
		
		/*
		 * 소수 배열, 검사를 따로하지 않고 판별과 동시에 출력
		 * 단 이 방법은 Math.sqrt(), 즉 최댓값의 제곱근까지만 순회하는 것이 아니라 
		 * 최댓값까지 계속 순회해야 가능하다.
		 * 또한, 이중 반복문의 내부 반복문은 int j=i*i을 할 경우 입력 최댓값이 1,000,000 이라
		 * i 가 최대 1,000,000가 된다면 j의 경우 1,000,000,000,000 으로 int형 범위를 넘어버릴 수 있다.
		 * 그래서 int j = i+i로 변경하여 풀어야 한다.
		 */

		for(int i=2; i<=N; i++) {
			if(prime[i]) continue;
			
			if(i>=M) sb.append(i).append('\n');
			
			for(int j=i+i; j<=N; j+=i) { // i*i의 경우 j가 int형 범위를 넘어버릴 수 있다. 범위도 length 가 아니라 N도 포함하게 변경
				prime[j] = true;
			}
		}
		
		System.out.print(sb);

	}

}
