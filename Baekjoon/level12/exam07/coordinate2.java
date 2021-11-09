package level12.exam07;

import java.util.Arrays;
import java.util.Scanner;

public class coordinate2 {
	
	// ���� : https://www.acmicpc.net/problem/11651

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int[][] arr = new int[N][2];
		
		for(int i=0; i<N; i++) {
			arr[i][0] = sc.nextInt();
			arr[i][1] = sc.nextInt();
		}
		
		sc.close();
		
		//���ٽ�
		Arrays.sort(arr, (e1, e2) -> {
			if(e1[1] == e2[1]) {
				return e1[0] - e2[0];
			}
			else {
				return e1[1] - e2[1];
			}
		});
		
		StringBuilder sb = new StringBuilder();
		for(int i=0; i<N; i++) {
			sb.append(arr[i][0]).append(" ").append(arr[i][1]).append('\n');
		}
		
		System.out.print(sb);
	}

}
