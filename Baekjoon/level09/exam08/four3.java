package level09.exam08;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class four3 {
	
	// 출저 : https://www.acmicpc.net/problem/3009

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer token = new StringTokenizer(br.readLine()," ");	
		int[] dot1 = { Integer.parseInt(token.nextToken()), Integer.parseInt(token.nextToken()) }; // 첫 번째 점의 위치
		
		token = new StringTokenizer(br.readLine()," ");
		int[] dot2 = { Integer.parseInt(token.nextToken()), Integer.parseInt(token.nextToken()) }; // 두 번째 점의 위치
		
		token = new StringTokenizer(br.readLine()," ");
		int[] dot3 = { Integer.parseInt(token.nextToken()), Integer.parseInt(token.nextToken()) }; // 세 번째 점의 위치
		br.close();
		
		int x = 0;
		int y = 0;
		
		// x 좌표 비교 
		if(dot1[0] == dot2[0]) x = dot3[0];
		else if(dot1[0] == dot3[0]) x = dot2[0];
		else x = dot1[0];

		
		// y 좌표 비교
		if(dot1[1] == dot2[1]) y = dot3[1];
		else if(dot1[1] == dot3[1]) y = dot2[1];	
		else y = dot1[1];
			
		System.out.print(x + " " + y);

	}

}
