package level06.exam02;

public class selfNumber2 {
	
	// 출저 : https://www.acmicpc.net/problem/4673

	public static void main(String[] args) {
		
		boolean[] check = new boolean[10001];
		
		for(int i=1; i<10001; i++) { // 문제에서 요구한 범위
			int n = d(i);
			
			if(n < 10001) {
				check[n] = true;
			}
		}
		
		StringBuilder sb = new StringBuilder();
		
		for(int i=1; i<10001; i++) {
			if(!check[i]) {
				sb.append(i).append('\n');
			}
		}
		
		System.out.print(sb);

	}

	private static int d(int number) {
		int sum = number;
		
		while(number != 0) {
			sum = sum + (number % 10); // 주어진 값의 첫 째 자리수
			number = number/10; // 10을 나누어 첫 째 자리를 없앤다.
		}
		return sum;
	}

}
