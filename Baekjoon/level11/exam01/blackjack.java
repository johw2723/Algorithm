package level11.exam01;

import java.util.Scanner;

public class blackjack {
	
	// 출저 : https://www.acmicpc.net/problem/2798
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt(); // 카드의 개수
		int M = sc.nextInt(); // 조건
		int[] arr = new int[N];
		int answer = 0;
		
		for(int i=0; i<N; i++) {
			arr[i] = sc.nextInt();
		}
		
		sc.close();
		
		for(int i=0; i<N-2; i++) { // 3개를 고르기 때문에 첫번째 카드는 N-2 까지
			for(int j=i+1; j<N-1; j++) { // 두번째 카드는 N-1 까지
				for(int k=j+1; k<N; k++) { // 세번째 카드는 N까지 
					int temp = arr[i] + arr[j] + arr[k];
					
					if(M == temp) { // M과 세 카드의 합이 같은지 확인
						answer = temp;
					}
					
					if(answer < temp && temp < M) { // 세 카드의 합이 이전 합보다 크면서 M보다 작을 경우 갱신
						answer = temp;
					}
				}
			}
		}
		System.out.println(answer);
	}

}
