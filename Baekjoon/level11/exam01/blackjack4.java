package level11.exam01;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class blackjack4 {
	
	// ���� : https://www.acmicpc.net/problem/2798
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer token = new StringTokenizer(br.readLine()," ");
		int N = Integer.parseInt(token.nextToken()); // ī���� ����
		int M = Integer.parseInt(token.nextToken()); // ����
		int[] arr = new int[N];
		
		token = new StringTokenizer(br.readLine()," ");
		for(int i=0; i<N; i++) {
			arr[i] = Integer.parseInt(token.nextToken());
		}
		
		br.close();
		
		int answer = search(arr, N, M);
		
		System.out.println(answer);
	}

	private static int search(int[] arr, int N, int M) {
		int answer = 0;
		
		for(int i=0; i<N-2; i++) { // 3���� ���� ������ ù��° ī��� N-2 ����
			
			if(arr[i] > M) continue; // ù ��° ī�尡 M���� ũ�� �ǳʶڴ�.
			
			for(int j=i+1; j<N-1; j++) { // �ι�° ī��� N-1 ����
				
				if(arr[i] + arr[j] > M) continue; // �� ī���� ���� M���� ũ�� �ǳʶڴ�.
				
				for(int k=j+1; k<N; k++) { // ����° ī��� N���� 
					int temp = arr[i] + arr[j] + arr[k];
					
					if(M == temp) { // M�� �� ī���� ���� ������ Ȯ��
						return temp;
					}
					
					if(answer < temp && temp < M) { // �� ī���� ���� ���� �պ��� ũ�鼭 M���� ���� ��� ����
						answer = temp;
					}
				}
			}
		}
		
		// ��ȸ�� ��ġ�� ����
		return answer;
	}

}
