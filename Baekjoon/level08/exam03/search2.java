package level08.exam03;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class search2 {
	
	// 출저 : https://www.acmicpc.net/problem/1193

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int X = Integer.parseInt(br.readLine());
		br.close();
		
		/*
		 * 1/1 : A case = 개수가 홀수, 분자>=분모 시작, 우상향
		 * 1/2 2/1 : B case = 개수가 짝수, 분자<분모 시작, 좌하향
		 * 3/1 2/2 1/3 : A
		 * 1/4 2/3 3/2 4/1 : B
		 * 5/1 4/2 3/3 2/4 1/5 : A 
		 */
		
		int line_count = 1;
		int block_count = 0;
		
		while(true) {
			if(X <= line_count + block_count) {
				if(line_count % 2 == 1) { // 대각선이 홀수번째일 경우 : 개수가 칸의 개수가 홀수
					// 분자 : 대각선 개수 - (X번째 - 누적 칸의 합 -1) 
					// 분모 : X번째 - 직전 대각선까지의 합
					System.out.print((line_count - (X - block_count -1)) + "/" + (X - block_count));
					break;
				}
				
				else { // 대각선의 개수가 짝수
					System.out.print((X - block_count) + "/" + (line_count - (X - block_count - 1)));
					break;
				}
			} else {
				block_count += line_count;
				line_count++;
			}
		}

	}

}
