package level09.exam07;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class escape3 {
	
	// 출저 : https://www.acmicpc.net/problem/1085

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer token = new StringTokenizer(br.readLine()," ");
		
		int x = Integer.parseInt(token.nextToken());
		int y = Integer.parseInt(token.nextToken());
		int w = Integer.parseInt(token.nextToken());
		int h = Integer.parseInt(token.nextToken());
		
		// Math.min() : 입력받은 두개의 값 중 작은 값을 리턴
		int x_min = Math.min(x, w-x); // x축 최소거리
		int y_min = Math.min(y, h-y); // y축 최소거리
		
		// 요구사항 : x와 y축 중 최소거리
		System.out.print(Math.min(x_min, y_min));

	}

}
