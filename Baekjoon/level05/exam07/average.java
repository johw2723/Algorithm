package level05.exam07;

import java.util.Scanner;

public class average {
	
	// ���� : https://www.acmicpc.net/problem/4344
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int C = sc.nextInt(); // �׽�Ʈ���̽� ��
		int[] arr;
		
		for(int i=0; i<C; i++) {
			int student = sc.nextInt(); // �л� ��
			arr = new int[student];
			
			double sum = 0; 
			
			for(int j=0; j<student; j++) {
				int score = sc.nextInt(); // ����
				arr[j] = score;
				sum += score; // ���� ���� ��
			}
			
			double avg = (sum/student);
			double count = 0; // ����� �Ѵ� �л� ��
			
			// �䱸���� ���ϱ�
			for(int j=0; j<student; j++) {
				if(arr[j] > avg) {
					count++;
				}
			}
			System.out.printf("%.3f%%\n", (count/student)*100);
		}
		sc.close();
				
	}

}
