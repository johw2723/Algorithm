package level04.exam03;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class sumCycle2 {
	
	// √‚¿˙ : https://www.acmicpc.net/problem/1110

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		br.close();
	
		int cycle = 0;
		int temp = N;
		
		while(true) {
			N = ((N % 10) * 10) + (((N / 10) + (N % 10)) % 10);
			cycle++;
			
			if(N == temp) {
				break;
			}
		}
		System.out.println(cycle);

	}

}
