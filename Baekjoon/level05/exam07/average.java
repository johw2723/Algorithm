package level05.exam07;

import java.util.Scanner;

public class average {
	
	// 출저 : https://www.acmicpc.net/problem/4344
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int C = sc.nextInt(); // 테스트케이스 수
		int[] arr;
		
		for(int i=0; i<C; i++) {
			int student = sc.nextInt(); // 학생 수
			arr = new int[student];
			
			double sum = 0; 
			
			for(int j=0; j<student; j++) {
				int score = sc.nextInt(); // 성적
				arr[j] = score;
				sum += score; // 성적 누적 합
			}
			
			double avg = (sum/student);
			double count = 0; // 평균을 넘는 학생 수
			
			// 요구사항 구하기
			for(int j=0; j<student; j++) {
				if(arr[j] > avg) {
					count++;
				}
			}
			System.out.printf("%.3f%%\n", (count/student)*100);
		}
		sc.close();
				
	}

}
