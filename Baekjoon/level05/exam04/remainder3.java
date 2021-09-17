package level05.exam04;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;

public class remainder3 {
	
	// ���� : https://www.acmicpc.net/problem/3052
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		/* HashSet : �ڹ� Collection �� Set�� �Ļ� Ŭ���� 
		 * Ư¡ 1 : �ߺ��Ǵ� ���Ҹ� ���� ��� [�ϳ��� ����]�Ѵ�. == �ߺ����Ҹ� ������� �ʴ´�.
		 * Ư¡ 2 : HashSet�� ���� ������ ����. == Collections.sort() �޼ҵ� ��� �Ұ��� 
		 */
		HashSet<Integer> hs = new HashSet<Integer>();
		
		for(int i=0; i<10; i++) {
			hs.add(Integer.parseInt(br.readLine()) % 42);
		}
		br.close();
		System.out.println(hs.size());
	}

}
