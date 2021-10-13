package level09.exam01;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class primeNumber3 {
	
	// ���� : https://www.acmicpc.net/problem/1978

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		br.readLine();
		int count = 0;
		
		StringTokenizer token = new StringTokenizer(br.readLine()," ");
		
		while(token.hasMoreTokens()) {
			// �Ҽ��� ��� true, �ƴѰ�� false
			boolean is_prime = true;
			
			int num = Integer.parseInt(token.nextToken());
			
			if(num == 1) {
				continue;
			}
			
			for(int i=2; i<= Math.sqrt(num); i++) {
				if(num%i == 0) {
					is_prime = false;
					break;
				}
			}
			if(is_prime) {
				count++;
			}
		}
		
		System.out.println(count);
	}
}
