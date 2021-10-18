package level09.exam08;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class four3 {
	
	// ���� : https://www.acmicpc.net/problem/3009

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer token = new StringTokenizer(br.readLine()," ");	
		int[] dot1 = { Integer.parseInt(token.nextToken()), Integer.parseInt(token.nextToken()) }; // ù ��° ���� ��ġ
		
		token = new StringTokenizer(br.readLine()," ");
		int[] dot2 = { Integer.parseInt(token.nextToken()), Integer.parseInt(token.nextToken()) }; // �� ��° ���� ��ġ
		
		token = new StringTokenizer(br.readLine()," ");
		int[] dot3 = { Integer.parseInt(token.nextToken()), Integer.parseInt(token.nextToken()) }; // �� ��° ���� ��ġ
		br.close();
		
		int x = 0;
		int y = 0;
		
		// x ��ǥ �� 
		if(dot1[0] == dot2[0]) x = dot3[0];
		else if(dot1[0] == dot3[0]) x = dot2[0];
		else x = dot1[0];

		
		// y ��ǥ ��
		if(dot1[1] == dot2[1]) y = dot3[1];
		else if(dot1[1] == dot3[1]) y = dot2[1];	
		else y = dot1[1];
			
		System.out.print(x + " " + y);

	}

}
