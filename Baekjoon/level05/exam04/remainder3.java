package level05.exam04;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;

public class remainder3 {
	
	// 출저 : https://www.acmicpc.net/problem/3052
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		/* HashSet : 자바 Collection 중 Set의 파생 클래스 
		 * 특징 1 : 중복되는 원소를 넣을 경우 [하나만 저장]한다. == 중복원소를 허용하지 않는다.
		 * 특징 2 : HashSet은 순서 개념이 없다. == Collections.sort() 메소드 사용 불가능 
		 */
		HashSet<Integer> hs = new HashSet<Integer>();
		
		for(int i=0; i<10; i++) {
			hs.add(Integer.parseInt(br.readLine()) % 42);
		}
		br.close();
		System.out.println(hs.size());
	}

}
