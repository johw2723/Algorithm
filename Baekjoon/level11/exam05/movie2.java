package level11.exam05;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class movie2 {
	
	// 출저 : https://www.acmicpc.net/problem/1436

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		br.close();
		
		int num = 666;
		int count = 1;
		
		while(count != N) { // count 와 N이 다른게 맞다면 num의 숫자는 증가하고 1666, 2666 등에서 멈춘다. 
			num++;
			
			// contains() :  문자열 안에 검사하려는 문자열이 포함되어 있는지를 검사하고 T, F 반환
			if(String.valueOf(num).contains("666")) {
				count++;
			}
		}
		
		System.out.print(num);

	}

}
