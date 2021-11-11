package level12.exam08;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class word {
	
	// ���� : https://www.acmicpc.net/problem/1181

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		String[] arr = new String[N];
		
		sc.nextLine(); // ���� ����
		
		for(int i=0; i<N; i++) {
			arr[i] = sc.nextLine();
		}
		
		sc.close();
		
		Arrays.sort(arr, new Comparator<String>() {
			public int compare(String s1, String s2) {
				// �ܾ� ���̰� ���� ���
				if(s1.length() == s2.length()) {
					return s1.compareTo(s2);
				}
				// �� ���� ���
				else {
					return s1.length() - s2.length();
				}
			}
		});
		
		System.out.println(arr[0]);
		
		for(int i=1; i<N; i++) {
			// �ߺ����� �ʴ� �ܾ ���
			if(!arr[i].equals(arr[i-1])) {
				System.out.println(arr[i]);
			}
		}

	}

}