package level07.exam06;

import java.io.IOException;

public class countWords4 {
	
	// ���� : https://www.acmicpc.net/problem/1152

	public static void main(String[] args) throws IOException {
		int cnt = 0;		
		int pre_str = 32; // ����
		int str;

		while(true) {
			str = System.in.read();
			
			// �Է¹��� ���ڰ� ������ ��
			if(str == 32) {
				// ������ ���ڰ� ������ �ƴϸ�
				if(pre_str != 32) cnt++;
			} 
			// �Է¹��� ���ڰ� ������ �� ('\n')
			else if(str == 10) {
				// ������ ���ڰ� ������ �ƴϸ�
				if(pre_str != 32) cnt++;
				break;
			}
			
			pre_str = str;
		}
		
		System.out.println(cnt);

	}

}
