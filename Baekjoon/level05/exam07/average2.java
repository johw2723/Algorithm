package level05.exam07;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class average2 {
	
	// 출저 : https://www.acmicpc.net/problem/4344
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int C = Integer.parseInt(br.readLine()); // 테스트케이스 수
		int[] arr;
		
		StringTokenizer token;
		for(int i=0; i<C; i++) {
			token = new StringTokenizer(br.readLine()," ");
			int student = Integer.parseInt(token.nextToken()); // 학생 수
			arr = new int[student];
			
			double sum = 0; 
			
			for(int j=0; j<student; j++) {
				int score = Integer.parseInt(token.nextToken()); // 성적
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
		br.close();
				
	}

}
