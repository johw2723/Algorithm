package level12.exam09;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class age7 {
	
	// ���� : https://www.acmicpc.net/problem/10814

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		
		// �ԷµǴ� ������ ���� : 1 ~ 200
		StringBuilder[] p = new StringBuilder[201];
		
		// ��ü�迭�� �ε����� �� StringBuilder ��ü�� �����Ѵ�.
		for(int i=0; i<p.length; i++) {
			p[i] = new StringBuilder();
		}
		
		StringTokenizer token;
		for(int i=0; i<N; i++) {
			token = new StringTokenizer(br.readLine()," ");
			int age = Integer.parseInt(token.nextToken());
			String name = token.nextToken();
			// ī���� ���� : ���̸� index �� �Ͽ� �ش� �迭�� ���̿� �̸��� append() �Ѵ�.
			p[age].append(age).append(' ').append(name).append('\n');
		}
		
		StringBuilder sb = new StringBuilder();
		for(StringBuilder value : p) {
			sb.append(value);
		}
		
		System.out.print(sb);
	}

}
