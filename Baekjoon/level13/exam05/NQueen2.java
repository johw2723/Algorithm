package level13.exam05;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class NQueen2 {
	
	// ���� : https://www.acmicpc.net/problem/9663
	public static int[] arr; // 1���� �迭 ����, �迭 �ε���(��ġ)�� ���� �ǹ�, �ε����� ���� ���� �ǹ�
	public static int N;
	public static int count;

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		N = Integer.parseInt(br.readLine());
		br.close();
		
		arr = new int[N];
		nQueen(0);
		System.out.print(count);

	}

	private static void nQueen(int depth) {
		// ��� ���Ҹ� �� ä�� ���¸� count ���� �� ����
		if(depth == N) {
			count++;
			return;
		}
		
		for(int i=0; i<N; i++) {
			arr[depth] = i;
			// ���� �� �ִ� ��ġ�� ��� ���ȣ��, �ƴϸ� �ݺ��� ����
			if(Possibility(depth)) {
				nQueen(depth + 1);
			}
		}
		
	}

	private static boolean Possibility(int col) {
		for(int i=0; i<col; i++) {
			// �ش� ���� ��� i���� ���� ��ġ�� ��� (���� ���� ������ ���)
			if(arr[col] == arr[i]) {
				return false;
			}
			// ���� ���� ���� ���� ���� ��� (�밢������ �����ִ� ���)
			else if(Math.abs(col - i) == Math.abs(arr[col] - arr[i])) {
				return false;
			}
		}
		return true;
	}

}
