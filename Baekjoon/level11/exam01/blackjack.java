package level11.exam01;

import java.util.Scanner;

public class blackjack {
	
	// ���� : https://www.acmicpc.net/problem/2798
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt(); // ī���� ����
		int M = sc.nextInt(); // ����
		int[] arr = new int[N];
		int answer = 0;
		
		for(int i=0; i<N; i++) {
			arr[i] = sc.nextInt();
		}
		
		sc.close();
		
		for(int i=0; i<N-2; i++) { // 3���� ���� ������ ù��° ī��� N-2 ����
			for(int j=i+1; j<N-1; j++) { // �ι�° ī��� N-1 ����
				for(int k=j+1; k<N; k++) { // ����° ī��� N���� 
					int temp = arr[i] + arr[j] + arr[k];
					
					if(M == temp) { // M�� �� ī���� ���� ������ Ȯ��
						answer = temp;
					}
					
					if(answer < temp && temp < M) { // �� ī���� ���� ���� �պ��� ũ�鼭 M���� ���� ��� ����
						answer = temp;
					}
				}
			}
		}
		System.out.println(answer);
	}

}
