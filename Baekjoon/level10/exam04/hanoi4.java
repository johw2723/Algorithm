package level10.exam04;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class hanoi4 {
	
	// 출저 : https://www.acmicpc.net/problem/11729
	public static StringBuilder sb = new StringBuilder();

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		br.close();
		
		/* 
		 * 1. 가장 큰 원판(5)을 C로 옮기기 위해서는 n-1개의 원판(1~4)이 A에서 B로 가야한다 : Hanoi(n-1)
		 * 2. A에 있는 가장 큰 원판(5)이 C로 이동 : 1
		 * 3. B에 있는 n-1개의 원판(1~4)을 C로 이동 : Hanoi(n-1)
		 * 
		 * 공식화
		 * Hanoi(n) = 2 * Hanoi(n-1) + 1 
		 * a(n) = a(n-1) + 1 + a(n-1)
		 * a(n) = 2*a(n-1)+1 
		 * a(1) = 1, a(n+1) = 2a(n)+1
		 * a(n+1) + 1 = 2(a(n) + 1)
		 * b(n) = a(n) + 1 이라 정의할 때
		 * b(n+1) = 2b(n)
		 * b(1) = a(1) + 1 = 2 
		 * 즉 첫째항은 2이고, 공비는 2인 공비수열 
		 * b(n) = a(n) + 1 = 2ⁿ
		 * 즉 a(n) = 2ⁿ-1
		 */
		
		sb.append((int)Math.pow(2, N) - 1).append('\n'); // Math.pow () : 거듭제곱을 구하는 함수
		
		Hanoi(N, 1, 2, 3); // 원판의 개수, 출발지, 중간지점, 목적지
		
		System.out.println(sb);
	}

	private static void Hanoi(int N, int start, int mid, int to) {
		/*
		N : 원판의 개수
		start : 출발지
		mid : 옮기기 위해 이동할 장소
		to : 목적지
		*/
		
		// 이동할 원반의 수가 1개
		if(N == 1) {
			sb.append(start + " " + to).append('\n');
			return;
		}
		// 1단계 : N-1개를 A에서 B로 이동
		Hanoi(N-1, start, to, mid);
		
		// 2단계 : 1개를 A에서 C로 이동
		sb.append(start + " " + to).append('\n');
		
		// 3단계 : N-1개를 B에서 C로 이동
		Hanoi(N-1, mid, start, to);
	}

}
