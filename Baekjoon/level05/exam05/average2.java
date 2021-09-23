package level05.exam05;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class average2 {
	
	// 출저 : https://www.acmicpc.net/problem/1546

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		double[] arr = new double[Integer.parseInt(br.readLine())];
		double sum = 0;
		
		// 배열에 값 넣기
		StringTokenizer token = new StringTokenizer(br.readLine()," ");
		
		for(int i=0; i<arr.length; i++) {
			arr[i] = Double.parseDouble(token.nextToken());
		}
		br.close();
		
		// 최대값 구하기
		Arrays.sort(arr); // 배열에 저장된 값을 오름차순으로 정렬
		double M = arr[arr.length-1];

		
		// 평균 구하기
		for(int i=0; i<arr.length; i++) {
			sum += (arr[i]/M)*100;
		}
		System.out.println(sum/arr.length);
	}

}
