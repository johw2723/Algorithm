package level11.exam05;

import java.util.Scanner;

public class movie {
	
	// 출저 : https://www.acmicpc.net/problem/1436

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		sc.close();
		
		int num = 666;
		int count = 1;
		
		while(count != N) {
			num++;
			
			// contains() :  문자열 안에 검사하려는 문자열이 포함되어 있는지를 검사하고 T, F 반환
			if(String.valueOf(num).contains("666")) {
				count++;
			}
		}
		
		System.out.print(num);

	}

}
