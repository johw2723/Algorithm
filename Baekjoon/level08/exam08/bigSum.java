package level08.exam08;

import java.util.Scanner;

public class bigSum {
	
	// 출저 : https://www.acmicpc.net/problem/10757

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String strA = sc.next();
		String strB = sc.next();
		sc.close();
		
		// 두 개의 수 중 가장 긴 자리수 길이를 구해둔다.
		// Math.max : 두 수를 비교해서 큰 값을 리턴한다.
		int max_length = Math.max(strA.length(), strB.length());
		
		// 배열 생성 (마지막 자리수 올림이 있을 수 있으므로 1칸을 더 생성한다)
		int[] A = new int[max_length + 1];
		int[] B = new int[max_length + 1];
		
		// 초기화
		
		for(int i = strA.length() - 1, idx = 0; i >= 0; i--, idx++) {
			A[idx] = strA.charAt(i) - '0'; // 맨 뒤 문자부터 역순으로 하나씩 저장
		}
		
		for(int i = strB.length() - 1, idx = 0; i >= 0; i--, idx++) {
			B[idx] = strB.charAt(i) - '0'; // 맨 뒤 문자부터 역순으로 하나씩 저장
		}
		
		// 더하기
		for(int i=0; i<max_length; i++) {
			int value = A[i] + B[i];
			A[i] = value % 10;  // 더한 값의 10으로 나눈 나머지가 자리값이 된다.
			A[i + 1] += (value / 10); // 더한 값의 10으로 나눈 몫이 올림값이 된다.
		}
		
		// 출력 
		StringBuilder sb = new StringBuilder();
		if(A[max_length] != 0) { // 가장 높은 자리수가 0일 수도 있기 때문에
			sb.append(A[max_length]);
		}
		
		for(int i = max_length - 1; i>=0; i--) { // 맨 뒤 문자부터 입력했기 때문에 역순으로 출력한다.
			sb.append(A[i]);
		}
		
		System.out.println(sb);

	}

}
