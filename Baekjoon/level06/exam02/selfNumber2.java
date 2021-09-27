package level06.exam02;

public class selfNumber2 {
	
	// ���� : https://www.acmicpc.net/problem/4673

	public static void main(String[] args) {
		
		boolean[] check = new boolean[10001];
		
		for(int i=1; i<10001; i++) { // �������� �䱸�� ����
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
			sum = sum + (number % 10); // �־��� ���� ù ° �ڸ���
			number = number/10; // 10�� ������ ù ° �ڸ��� ���ش�.
		}
		return sum;
	}

}
