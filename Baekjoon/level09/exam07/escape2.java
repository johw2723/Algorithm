package level09.exam07;

import java.util.Scanner;

public class escape2 {
	
	// 출저 : https://www.acmicpc.net/problem/1085

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		int y = sc.nextInt();
		int w = sc.nextInt();
		int h = sc.nextInt();
		sc.close();
		
		// Math.min() : 입력받은 두개의 값 중 작은 값을 리턴
		int x_min = Math.min(x, w-x); // x축 최소거리
		int y_min = Math.min(y, h-y); // y축 최소거리
		
		// 요구사항 : x와 y축 중 최소거리
		System.out.print(Math.min(x_min, y_min));

	}

}
