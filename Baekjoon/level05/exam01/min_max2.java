package level05.exam01;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class min_max2 {
	
	// 출저 : https://www.acmicpc.net/problem/10818
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		int[] arr = new int[N];
		
		StringTokenizer token = new StringTokenizer(br.readLine()," ");
		
		for(int i=0; i<N; i++) {		
			arr[i] = Integer.parseInt(token.nextToken());	
		}
		
		br.close();
		Arrays.sort(arr); // Arrays.sort : 배열에 저장된 원소값을 오름차순으로 정렬
		System.out.println(arr[0]+" "+arr[N-1]);
	}

}
