package level12.exam03;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class sort {
	
	// √‚¿˙ : https://www.acmicpc.net/problem/10989

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		
		ArrayList<Integer> list = new ArrayList<>();
		
		for(int i=0; i<N; i++) {
			list.add(sc.nextInt());
		}
		sc.close();
		
		Collections.sort(list);
		
		StringBuilder sb = new StringBuilder();
		
		for(int value : list) {
			sb.append(value).append('\n');
		}
		
		System.out.print(sb);

	}

}
