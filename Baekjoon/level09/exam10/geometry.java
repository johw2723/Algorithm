package level09.exam10;

import java.util.Scanner;

public class geometry {
	
	// 출저 : https://www.acmicpc.net/problem/3053

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double R = sc.nextDouble(); // 반지름 R
		sc.close();
		
		// 유클리드 기하학 : D(T₁, T₂)² = (x₁ - x₂)² + (y₁ - y₂)² 
		// 택시 기하학  : D(T₁, T₂) = |x₁ - x₂| + |y₁ - y₂|
		
		/*
		 * 원의 넓이 = PI * r² I
		 * 
		 * 택시 기하학 D = |x| + |y|
		 * 원의 넓이 (정사각형) = 2r²
		 */
		
		// Math.PI : 원주율 값 
		System.out.println(R * R * Math.PI); // 유클리드 원의 넓이
		System.out.println(2 * R * R); // 택시기하학 원의 넓이

	}

}
