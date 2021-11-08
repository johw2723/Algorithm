package level12.exam06;

import java.util.Scanner;

public class coordinate {
	
	// √‚¿˙ : https://www.acmicpc.net/problem/11650

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int[][] arr = new int[N][2];
		
		for(int i=0; i<N; i++) {
			arr[i][0] = sc.nextInt();
			arr[i][1] = sc.nextInt();
		}
		
		sc.close();
		
		for(int i=0; i<N-1; i++) {
			for(int j=i+1; j<N; j++) {
				if(arr[i][0] > arr[j][0]) {
					int temp = arr[j][0];
					arr[j][0] = arr[i][0];
					arr[i][0] = temp;
				} 
				else if(arr[i][0] == arr[j][0]) {
					if(arr[i][1] > arr[j][1]) {
						int temp = arr[j][1];
						arr[j][1] = arr[i][1];
						arr[i][1] = temp;
					}
				}
			}
		}
		
		for(int i=0; i<N; i++) {
			System.out.println(arr[i][0] + " " + arr[i][1]);
		}
	}

}
