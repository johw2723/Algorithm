package level09.exam08;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class four4 {
	
	// 출저 : https://www.acmicpc.net/problem/3009

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] dot1 = br.readLine().split(" "); // 첫 번째 점의 위치
		String[] dot2 = br.readLine().split(" "); // 두 번째 점의 위치 
		String[] dot3 = br.readLine().split(" "); // 세 번째 점의 위치 
		br.close();
		
		//System.out.println(dot1[0] + " " + dot1[1]);
		
		String x;
		String y;
		
		// x 좌표 비교 
		if(dot1[0].equals(dot2[0])) x = dot3[0];
		else if(dot1[0].equals(dot3[0])) x = dot2[0];
		else x = dot1[0];

		
		// y 좌표 비교
		if(dot1[1].equals(dot2[1])) y = dot3[1];
		else if(dot1[1].equals(dot3[1])) y = dot2[1];	
		else y = dot1[1];
			
		System.out.print(x + " " + y);

	}

}
