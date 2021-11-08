package level12.exam06;

import java.util.Arrays;
import java.util.Scanner;

public class coordinate3 {
	
	// 출저 : https://www.acmicpc.net/problem/11650

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int[][] arr = new int[N][2];
		
		for(int i=0; i<N; i++) {
			arr[i][0] = sc.nextInt();
			arr[i][1] = sc.nextInt();
		}
		
		sc.close();
		
		// 람다식
		Arrays.sort(arr, (e1, e2) -> {
			if(e1[0] == e2[0]) {
				return e1[1] - e2[1];
			} else {
				return e1[0] - e2[0];
			}
		});
		
		for(int i=0; i<N; i++) {
			System.out.println(arr[i][0] + " " + arr[i][1]);
		}
	}

}
