package level11.exam05;

import java.util.Scanner;

public class movie3 {
	
	// ���� : https://www.acmicpc.net/problem/1436

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		sc.close();
		
		if(N>1) {
			naming(N);
		}
		else {
			System.out.print(666);
		}

	}

	private static void naming(int n) {
		int count = 1;
		int prev_digit = 0; // ���� �ڸ���
		int num = 0;        // ���� �ڸ����� ������ ������ �� �ڸ���
		
		// prev_digit�� X...666X �̸鼭 X...6666 �� �ƴҰ�� (ex : 6660, 6661, ... )
		while(true) {
			if(((prev_digit % 10000) / 10) == 666 && prev_digit % 10 != 6) {
				for(int i=0; i<1000; i++) {
					if(count == n) {
						System.out.print(prev_digit * 1000 + num);
						return;
					}
					num++;
					count++;
				}
				prev_digit++;
			}
			
			// prev_digit�� X...666 �� ��� (ex : 666, 1666, ...)
			else if(prev_digit % 1000 == 666) {
				num = 0;
				for(int i=0; i<1000; i++) {
					if(count == n) {
						System.out.print(prev_digit * 1000 + num);
						return;
					}
					num++;
					count++;				
				}
				prev_digit++;
			}
			
			//prev_digit�� X...6 �� ��� (ex : 66_600, 166_600, ...)
			else if(prev_digit % 100 == 66) {
				num = 600;
				for(int i=0; i<100; i++) {
					if(count == n) {
						System.out.print(prev_digit * 1000 + num);
						return;
					}
					count++;
					num++;
				}
				prev_digit++;
			}
			
			// prev_digit�� X...6 �� ��� (ex : 6_660, 16_660, ...)
			else if(prev_digit % 10 == 6) {
				num = 660;
				for(int i=0; i<10; i++) {
					if(count == n) {
						System.out.print(prev_digit * 1000 + num);
						return;
					}
					num++;
					count++;
				}
				prev_digit++;
			}
			
			// �� �� (ex : x_666)
			else {
				num = 666;
				if(count == n) {
					System.out.print(prev_digit * 1000 + num);
					return;
				}
				count++;
				prev_digit++;
			}
			
		}
		
	}

}
