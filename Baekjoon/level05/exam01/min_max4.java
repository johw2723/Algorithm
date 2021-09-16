package level05.exam01;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class min_max4 {
	
	// 출저 : https://www.acmicpc.net/problem/10818
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		Integer.parseInt(br.readLine()); // 입력만 받고 사용 안함
		StringTokenizer token = new StringTokenizer(br.readLine()," ");
		br.close();
		
		// 제시된 입력값 : 모든 정수는 -1,000,000보다 크거나 같고, 1,000,000보다 작거나 같은 정수이다.
		int min = 1000001;	
		int max = -1000001;
		
		while(token.hasMoreElements()) { // hasMoreElements() : StringTokenizer에 토큰이 남아 있으면 true 값을 리턴한다.		
			int value = Integer.parseInt(token.nextToken());	
			if(value>max) {
				max = value;
			} else if(value<min) {
				min = value;
			}
		}
		
		System.out.println(min+" "+max);
	}

}
