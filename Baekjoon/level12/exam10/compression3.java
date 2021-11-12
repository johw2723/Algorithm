package level12.exam10;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

public class compression3 {
	
	// ���� : https://www.acmicpc.net/problem/18870

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		int[] arr = new int[N];
		
		StringTokenizer token = new StringTokenizer(br.readLine()," ");
		for(int i=0; i<N; i++) {
			arr[i] = Integer.parseInt(token.nextToken());
		}
		
		br.close();
		
		int[] sortArr = arr.clone(); // �Է� ���� �迭�� ���ĵ� �迭�� �����ϱ� ���� �迭 ����
		Arrays.sort(sortArr);  // �迭 ����
		
		Map<Integer, Integer> map = new HashMap<>();
		int index = 0;
		for(int i : sortArr) {
			if(!map.containsKey(i)) { // containsKey : hashMap�� �ִ� �޼���� �ش� �迭���� key���� sortArr[i] �� ������ ������ true ������ false �� ��ȯ 
				map.put(i, index++);  // put : hashmap�� �迭�� �߰��ϴ� �޼���� sortArr[i]�� key�� ����ϰ� index++ �� value�� ���
			}
		}
		
		/* ���� : �Է� ���� 2 4 -10 4 -9
		 * sortArr �迭 -10 -9 2 4 4 
		 * 1�� : key ���� �����Ƿ� key = -10 / value = 0 ���� �� index = 1�� ���� (���� ������)
		 * 2�� : key = -9 / value = 1 ���� �� index = 2
		 * 3�� : key = 2 / value = 2 ���� �� index = 3
		 * 4�� : key = 4 / valu = 4 ���� �� index = 4
		 * 5�� : key = 4�� ���� �̹� �ֱ� ������ ���ǹ��� ������� �ʰ� �ݺ��� ����
		 */
				
		StringBuilder sb = new StringBuilder();
		for(int i : arr) { // ����ؾ� �ϴ� ������ �Է� ���� ������ �Ѵ�. 
			sb.append(map.get(i)).append(" "); // get : �ش� key�� �ִ� value�� �����´�.
		}
		
		System.out.print(sb);

	}

}
