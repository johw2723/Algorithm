package level09.exam08;

import java.util.Scanner;

public class four2 {
	
	// ���� : https://www.acmicpc.net/problem/3009

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] dot1 = { sc.nextInt(), sc.nextInt() }; // ù ��° ���� ��ġ
		int[] dot2 = { sc.nextInt(), sc.nextInt() }; // �� ��° ���� ��ġ
		int[] dot3 = { sc.nextInt(), sc.nextInt() }; // �� ��° ���� ��ġ
		sc.close();
		
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
