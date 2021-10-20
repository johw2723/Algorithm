package level09.exam11;

import java.util.Scanner;

public class turret {
	
	// 출저 : https://www.acmicpc.net/problem/1002
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		
		for(int i=0; i<T; i++) {
			int x1 = sc.nextInt();
			int y1 = sc.nextInt();
			int r1 = sc.nextInt();
			
			int x2 = sc.nextInt();
			int y2 = sc.nextInt();
			int r2 = sc.nextInt();
			
			// 두 원의 중심이 같고, 반지름도 같을 때 : 접점의 개수가 무한 (x1 = x2, y1= y2, r1 = r2)
			// 접점이 없을 때, 두 점 사이의 거리가 각 원의 반지름의 합보다 큰 경우 (x2 - x1)² + (y2 - y1)² > (r1 + r2)²
			// 접점이 없을 때, 한 원 안에 다른원이 있으면서 접점이 없는 경우 (x2 - x1)² + (y2 - y1)² < (r2 - r1)² 
			// 접점이 한개일 때, 내접할 때 (x2 - x1)² + (y2 - y1)² = (r2 - r1)² 
			// 접점이 한개일 때, 외접할 때 (x2 - x1)² + (y2 - y1)² = (r2 + r1)² 
			// 이외는 접점이 두개
			
			// Math.pow(value1, value2) : 제곱을 계산하는 함수 value1의 value2 제곱
			int distance_pow = (int)(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2)); // 중점간 거리의 제곱 
			
			// 중심이 같으면서 반지름도 같을 경우
			if(x1 == x2 && y1 == y2 && r1 == r2) {
				System.out.println(-1);
			}
			
			// 두 점 사이의 거리가 각 원의 반지름의 합보다 큰 경우
			else if(distance_pow > Math.pow(r2 + r1, 2)) {
				System.out.println(0);
			}
			
			// 한 원 안에 다른원이 있으면서 접점이 없는 경우
			else if(distance_pow < Math.pow(r2 - r1, 2)) {
				System.out.println(0);
			}
			
			// 내접할 때
			else if(distance_pow == Math.pow(r2 - r1, 2)) {
				System.out.println(1);
			}
			
			// 외접할 때
			else if(distance_pow == Math.pow(r2 + r1, 2)) {
				System.out.println(1);
			}
			
			else {
				System.out.println(2);
			}
		}
		sc.close();
	}

}
