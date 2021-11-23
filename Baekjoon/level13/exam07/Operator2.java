package level13.exam07;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Operator2 {
	
	// √‚¿˙ : https://www.acmicpc.net/problem/14888
	public static int N; 
	public static int[] arr;
	public static int[] operator = new int[4];
	public static int MAX = Integer.MIN_VALUE;
	public static int MIN = Integer.MAX_VALUE;
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		N = Integer.parseInt(br.readLine());
		arr = new int[N];
		StringTokenizer token;
		
		token = new StringTokenizer(br.readLine()," ");
		for(int i=0; i<N; i++) {
			arr[i] = Integer.parseInt(token.nextToken());
		}
		
		token = new StringTokenizer(br.readLine()," ");
		for(int i=0; i<4; i++) {
			operator[i] = Integer.parseInt(token.nextToken());
		}
		
		br.close();
		
		dfs(arr[0], 1);
		
		System.out.println(MAX);
		System.out.println(MIN);
	}

	private static void dfs(int num, int idx) {
		if(idx == N) {
			MAX = Math.max(MAX, num);
			MIN = Math.min(MIN, num);
		}
		
		for(int i=0; i<4; i++) {
			if(operator[i] > 0) {
				operator[i]--;
				
				switch(i) {
				
				case 0 : dfs(num + arr[idx], idx+1); break;
				case 1 : dfs(num - arr[idx], idx+1); break;
				case 2 : dfs(num * arr[idx], idx+1); break;
				case 3 : dfs(num / arr[idx], idx+1); break;
				
				}
				
				operator[i]++;
			}
		}
		
	}


}
