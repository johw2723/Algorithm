package level12.exam05;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class sort4 {
	
	// ���� : https://www.acmicpc.net/problem/1427

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		char[] arr = br.readLine().toCharArray();
		br.close();
		
		Arrays.sort(arr);
		
		for(int i=arr.length-1; i>=0; i--) {
			System.out.print(arr[i]);
		}
	}

}
