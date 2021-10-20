package level09.exam11;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class turret3 {
	
	// 출저 : https://www.acmicpc.net/problem/1002
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer token;
		int T = Integer.parseInt(br.readLine());
		
		StringBuilder sb = new StringBuilder();
		
		for(int i=0; i<T; i++) {
			token = new StringTokenizer(br.readLine()," ");
			int x1 = Integer.parseInt(token.nextToken());
			int y1 = Integer.parseInt(token.nextToken());
			int r1 = Integer.parseInt(token.nextToken());
			
			int x2 = Integer.parseInt(token.nextToken());
			int y2 = Integer.parseInt(token.nextToken());
			int r2 = Integer.parseInt(token.nextToken());
			
			sb.append(get_count(x1, y1, r1, x2, y2, r2)).append('\n');	
			
		}
		br.close();
		System.out.println(sb);
	}

	private static int get_count(int x1, int y1, int r1, int x2, int y2, int r2) {
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
			return -1;
		}
							
		// 두 점 사이의 거리가 각 원의 반지름의 합보다 큰 경우
		else if(distance_pow > Math.pow(r2 + r1, 2)) {
			return 0;
		}
							
		// 한 원 안에 다른원이 있으면서 접점이 없는 경우
		else if(distance_pow < Math.pow(r2 - r1, 2)) {
			return 0;
		}
							
		// 내접할 때
		else if(distance_pow == Math.pow(r2 - r1, 2)) {
			return 1;
		}
					
		// 외접할 때
		else if(distance_pow == Math.pow(r2 + r1, 2)) {
			return 1;
		}
					
		else {
			return 2;
		}
	}

}
