package level05.exam01;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class min_max3 {
	
	// 출저 : https://www.acmicpc.net/problem/10818
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		int[] arr = new int[N];
		
		StringTokenizer token = new StringTokenizer(br.readLine()," ");
		br.close();
		
		int index = 0;
		
		while(token.hasMoreElements()) { // hasMoreElements() : StringTokenizer에 토큰이 남아 있으면 true 값을 리턴한다.		
			arr[index] = Integer.parseInt(token.nextToken());	
			index++;
		}
				
		Arrays.sort(arr); // Arrays.sort : 배열에 저장된 원소값을 오름차순으로 정렬
		System.out.println(arr[0]+" "+arr[N-1]);
	}

}
