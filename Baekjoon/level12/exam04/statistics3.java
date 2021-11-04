package level12.exam04;

import java.util.Scanner;

public class statistics3 {
	
	// 출저 : https://www.acmicpc.net/problem/2108

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		
		// 입력값의 범위 : -4000 ~ 4000 (정수의 절대값은 4000을 넘지 않음)
		int[] arr = new int[8001];
		int sum = 0;
		int max = Integer.MIN_VALUE; // 최댓값 : 작은 값에서부터 큰 값을 구하므로
		System.out.println("max : " + max);
		int min = Integer.MAX_VALUE; // 최솟값
		System.out.println("min : " + min);
		
		// 중앙값과 최빈값은 -4000~4000을 제외한 수로 초기화
		int median = 10000; // 중앙값
		int mode = 10000;  // 최빈값
		
		for(int i=0; i<N; i++) {
			int temp = sc.nextInt();
			sum += temp;
			arr[temp + 4000]++;
			
			if(max < temp) {
				max = temp;
				System.out.println("max" + i +" : " + max);
			}
			if(min > temp) {
				min = temp;
				System.out.println("min" + i +" : " + min);
			}
		}
		sc.close();
		
		System.out.println("max_end : " + max);
		System.out.println("min_end : " + min);
		
		// 순회
		int count = 0; // 중앙값 빈도 누적 수
		int mode_max = 0; // 최빈값의 최댓값
		
		// 이전과 동일한 최빈값이 1번만 등장했을 경우 true, 아닐경우 false
		boolean flag = false;
		
		for(int i=min+4000; i<=max+4000; i++) {
			
			if(arr[i]>0) {
				
				// 중앙값 찾기 : 누적횟수가 전체 길이의 절반에 못 미친다면
				if(count < (N+1) / 2) {
					count += arr[i]; // i값의 빈도수를 count에 누적
					median = i-4000;
				}
				
				// 최빈값 찾기 : 이전 최빈값보다 현재 값의 빈도수가 더 높을 경우
				if(mode_max < arr[i]) {
					mode_max = arr[i];
					mode = i-4000;
					flag = true; // 첫 등장이므로 true로 변경
				}
				// 이전 최빈값 최댓값과 동일한 경우이면서 한 번만 중복되는 경우
				else if(mode_max == arr[i] && flag == true) {
					mode = i-4000;
					flag = false;
				}			
			}
		}
			
		System.out.println((int)Math.round((double)sum/N));
		System.out.println(median);
		System.out.println(mode);
		System.out.println(max - min);

	}

}
