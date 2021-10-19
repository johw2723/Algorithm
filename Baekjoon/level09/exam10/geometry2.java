package level09.exam10;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class geometry2 {
	
	// 출저 : https://www.acmicpc.net/problem/3053

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		double R = Integer.parseInt(br.readLine());
		br.close();
		
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
