package level14.exam08;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class makeOne3 {

	// 출저 : https://www.acmicpc.net/problem/1463
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		br.close();
		
		System.out.println(make(N, 0));

	}

	private static int make(int N, int count) {
		// N이 2미만인 경우 누적된 count 값을 반환
		if(N < 2) {
			return count;
		}
		// DP를 갱신해주면서 이모제이션을 하는 방법 : N-1, 즉 1을 뺀 값도 재귀호출을 해야함
		// 나머지 값을 이용하여 count를 갱신해주는 방법 
		// N을 각각 2와 3으로 나누면 count는 +1에 각 연산의 나머지 값을 더해준 것이 된다. (나머지 값은 빼기 1을 했을 때의 count 값과 같기 때문)
		return Math.min(make(N/2, count + 1 + (N%2)), make(N/3, count + 1 + (N%3)));
	}

}
