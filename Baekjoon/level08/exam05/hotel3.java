package level08.exam05;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class hotel3 {
	
	// 출저 : https://www.acmicpc.net/problem/10250

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine()); // 테스트 케이스의 수
		
		StringBuilder sb = new StringBuilder(); // 테스트 케이스만큼 반복 출력해야하기 때문에, 묶어서 출력한다.
		StringTokenizer token;
		for(int i=0; i<T; i++) {
			token = new StringTokenizer(br.readLine()," ");
			int H = Integer.parseInt(token.nextToken()); // 호텔의 층 수
			int W = Integer.parseInt(token.nextToken()); // 각 층의 방 수
			int N = Integer.parseInt(token.nextToken()); // 몇 번째 손님
			
			// 2 3 5 : 101 201 / 102 202 / 103 203
			// 6 12 10 : 101 201 301 401 501 601 / 102 202 302 [402] 502 602 
			// 6 12 15 : 101 201 301 401 501 601 / 102 202 302 402 502 602 / 103 203 [303] 403 503 603 
			
			// Y 층 : N % H , 예외 N % H = 0 일 때 Y=H
			// X 방 :(N / H) + 1 :: X는 1부터 시작, 예외 N % H = 0 일 때 X = (N / H)
			
			if(N % H == 0) { // H 층이 배정받는 층 수
				sb.append((H*100) + (N / H)).append('\n');
			}
			
			else {
				sb.append((N % H)*100 + (N / H)+1).append('\n');
			}
			
			
		}
		br.close();
		
		System.out.print(sb);

	}

}
