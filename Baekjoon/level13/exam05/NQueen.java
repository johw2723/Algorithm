package level13.exam05;

import java.util.Scanner;

public class NQueen {
	
	// ���� : https://www.acmicpc.net/problem/9663
	public static int[] arr; // 1���� �迭 ����, �迭 �ε���(��ġ)�� ���� �ǹ�, �ε����� ���� ���� �ǹ�
	public static int N;
	public static int count;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		N = sc.nextInt();
		sc.close();
		
		arr = new int[N];
		nQueen(0);
		System.out.print(count);

	}

	private static void nQueen(int depth) {
		// ���� �� ä��� ī��Ʈ�� 1 ������Ű�� ���Ͻ�Ų��.
		if(depth == N) {
			count++;
			return;
		}
		
		for(int i=0; i<N; i++) {
			arr[depth] = i;
			// Possibility() �ش� ������ i��° �࿡ ���� �� �ִ����� �˻��ϰ� ���ݹ޴´ٸ� ���ȣ��, �ƴҰ�� �ݺ��� ����
			if(Possibility(depth)) {
				nQueen(depth + 1);
			}
		}
		
	}

	private static boolean Possibility(int col) {
		for(int i=0; i<col; i++) {
			// �ش� ���� ��� i���� ���� ��ġ�Ұ�� (���� �࿡ ������ ���)
			if(arr[col] == arr[i]) {
				return false;
			}
			
			// �밢���� �����ִ� ��� : ���� ���� ���� ���� ���� ���
			// Math.abs() : �־��� ������ ������ ��ȯ�Ѵ�.
			else if(Math.abs(col - i) == Math.abs(arr[col] - arr[i])) {
				return false;
			}
		}
		return true;
	}

}
