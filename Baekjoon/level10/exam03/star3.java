package level10.exam03;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class star3 {
	
	// 출저 : https://www.acmicpc.net/problem/2447
	
	static StringBuilder[] sb;

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine()); // N은 3의 거듭제곱
		br.close();
		
		sb = new StringBuilder[N];
		// String.format 을 이용하여 공백문자를 N길이만큼 만들고, 만들어진 문자열을 StringBuilder에 저장
		String s = String.format("%" + N + "s", ' ');
		for(int i=0; i<N; i++) {
			sb[i] = new StringBuilder(s);
		}
		
		// 재귀 함수에서 공백 부분이 아닌 부분만 공백을 *로 치환
		star(0, 0, N);
		
		for(int i=0; i<N; i++) {
			System.out.println(sb[i]);
		}
		
	}

	private static void star(int x, int y, int N) {	
		// 더이상 쪼갤 수 없는 블록일 때
		if(N == 1) {
			sb[x].setCharAt(y, '*');
			return;
		}
		
		// N = 27 일 경우 한 블록의 사이즈는 9이고, N = 9 일 경우 한 블록의 사이즈는 3이다	
		int size = N / 3; // 해당 블록의 한 칸을 담을 변수
		int count = 0; // 별 출력 누적
		
		for(int i=x; i<x+N; i+=size) {
			for(int j=y; j<y+N; j+=size) {
				count++;
				if(count != 5) {
					star(i, j, size);
				}
			}
		}
	}

}
