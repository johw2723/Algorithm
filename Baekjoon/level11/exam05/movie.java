package level11.exam05;

import java.util.Scanner;

public class movie {
	
	// ���� : https://www.acmicpc.net/problem/1436

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		sc.close();
		
		int num = 666;
		int count = 1;
		
		while(count != N) {
			num++;
			
			// contains() :  ���ڿ� �ȿ� �˻��Ϸ��� ���ڿ��� ���ԵǾ� �ִ����� �˻��ϰ� T, F ��ȯ
			if(String.valueOf(num).contains("666")) {
				count++;
			}
		}
		
		System.out.print(num);

	}

}
