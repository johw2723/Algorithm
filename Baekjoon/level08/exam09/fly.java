package level08.exam09;

import java.util.Scanner;

public class fly {
	
	// ���� : https://www.acmicpc.net/problem/1011

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt(); // �׽�Ʈ ���̽��� ��
		
		/*
		 * �Ÿ�(y-x) : move : count : max  /  count : y-x : move : max
		 * 1 : 1 : 1 : 1                  /    1   :  1  : 1    : 1
		 * 2 : 1 1 : 2 : 1                /    2   :  2  : 1 1  : 1
		 * 3 : 1 1 1 : 3 : 1              /    3   :  4  : 1 2 1    : 2
		 * 4 : 1 2 1 : 3 : 2              /    4   :  6  : 1 2 2 1  : 2
		 * 5 : 1 2 1 1 : 4 : 2            /    5   :  9  : 1 2 3 2 1    : 3
		 * 6 : 1 2 2 1 : 4 : 2            /    6   :  12 : 1 2 3 3 2 1  : 3 
		 * 7 : 1 2 2 1 1 : 5 : 2          /    7   :  16 : 1 2 3 4 3 2 1    : 4
		 * 8 : 1 2 2 2 1 : 5 : 2          /    8   :  20 : 1 2 3 4 4 3 2 1  : 4
		 * 9 : 1 2 3 2 1 : 5 : 3          /    9   :  25 : 1 2 3 4 5 4 3 2 1    : 5
		 * 10 : 1 2 3 2 1 1 : 6 : 3       /    10  :  30 : 1 2 3 4 5 5 4 3 2 1  : 5
		 */
		
		// max�� 1�� ���� �� 2���� �ݺ�
		// max�� ���ϴ� ������ �Ÿ��� max�� ������ 
		
		/* count : y-x : max
		 *   1   :  {1  :  1}
		 *   [2   :  2]  :  1
		 *   [3   :  3]  :  1
		 *   3   :  {4  :  2}
		 *   [4   :  5]  :  2
		 *   4   :  6  :  2
		 *   [5   :  7]  :  2
		 *   5   :  8  :  2
		 *   5   :  {9  :  3}
		 *   [6   :  10] :  3
		 *   6   :  11 :  3
		 *   6   :  12 :  3
		 *   [7   :  13] :  3
		 *   7   :  14 :  3
		 *   7   :  15 :  3
		 *   7   :  {16 :  4}
		 *   [8   :  17] :  4
		 *   8   :  18 :  4    
		 *   8   :  19 :  4    
		 *   8   :  20 :  4    
		 *   [9   :  21] :  4
		 *   9   :  22 :  4    
		 *   9   :  23 :  4    
		 *   9   :  24 :  4    
		 *   9   :  {25 :  5}
		 *   10  :  26 :  5
		 */  
		
		// max�� ���� y-x�� ��Ʈ ������ �Ҽ��������� �������� ���� : max = (int) Math.sqrt(y-x);
		// max�� ���ϴ� ������ ���� ���� ���̿��� �׻� count�� �ι��� ���Ѵ� {} ���� [] 2��
		// {} ������ [] ��Ģ�� �ݵ�� �´�. ((y-x) = max*max ������ count�� ������)
		// max ���� ���� ���� count �� ���� : count = (2 * max - 1)
		
		for(int i=0; i<T; i++) {
			int x = sc.nextInt(); // ������ġ
			int y = sc.nextInt(); // ��ǥ��ġ
			
			int distance = y - x;
			int max = (int)Math.sqrt(distance); // Math.sqrt() : �Է��� ���� ��Ʈ���� double ������ ����
			
			if(max == Math.sqrt(distance)){ // distance �� �������� ������ �������ٸ� : count = (2*max-1)
				System.out.println(2 * max - 1);
			}
			
			else if(distance <= max * max + max) { // ���� ���� �������� ���� max ������������ : ���� ������ max �� ����.
				System.out.println(2 * max);
			}
			
			else { 
				System.out.println(2 * max + 1);
			}
		}
		
		sc.close();

	}

}
