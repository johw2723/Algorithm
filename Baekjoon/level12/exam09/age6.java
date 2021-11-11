package level12.exam09;

import java.util.Scanner;

public class age6 {
	
	// 출저 : https://www.acmicpc.net/problem/10814

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		
		// 입력되는 나이의 범위 : 1 ~ 200
		StringBuilder[] p = new StringBuilder[201];
		
		// 객체배열의 인덱스에 각 StringBuilder 객체를 생성한다.
		for(int i=0; i<p.length; i++) {
			p[i] = new StringBuilder();
		}
		
		for(int i=0; i<N; i++) {
			int age = sc.nextInt(); // 나이
			String name = sc.next(); // dlfma
			// 카운팅 정렬 : 나이를 index 로 하여 해당 배열에 나이와 이름을 append() 한다.
			p[age].append(age).append(' ').append(name).append('\n');
		}
		
		sc.close();
		
		StringBuilder sb = new StringBuilder();
		for(StringBuilder value : p) {
			sb.append(value);
		}
		
		System.out.print(sb);
		
	}

}
