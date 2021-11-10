package level12.exam08;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;

public class word3 {
	
	// 출저 : https://www.acmicpc.net/problem/1181

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		String[] arr = new String[N];
		
		for(int i=0; i<N; i++) {
			arr[i] = br.readLine();
		}
		
		br.close();
		
		Arrays.sort(arr, new Comparator<String>() {
			public int compare(String s1, String s2) {
				// 길이가 같을 때
				if(s1.length() == s2.length()) {
					return s1.compareTo(s2);
				}
				// 그 외의 경우
				else {
					return s1.length() - s2.length();
				}
			}
		});
		
		StringBuilder sb = new StringBuilder();
		sb.append(arr[0]).append('\n');
		
		for(int i=1; i<N; i++) {
			// 중복되는 경우 제외
			if(!arr[i].equals(arr[i-1])) {
				sb.append(arr[i]).append('\n');
			}
		}
		
		System.out.print(sb);
		
	}

}
