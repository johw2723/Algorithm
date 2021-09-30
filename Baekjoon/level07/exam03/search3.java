package level07.exam03;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class search3 {
	
	// √‚¿˙ : https://www.acmicpc.net/problem/10809

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String S = br.readLine();
		br.close();
		
		StringBuilder sb = new StringBuilder();
		
		sb.append(S.indexOf('a'));
		sb.append(" ");
		sb.append(S.indexOf('b'));
		sb.append(" ");
		sb.append(S.indexOf('c'));
		sb.append(" ");
		sb.append(S.indexOf('d'));
		sb.append(" ");
		sb.append(S.indexOf('e'));
		sb.append(" ");
		sb.append(S.indexOf('f'));
		sb.append(" ");
		sb.append(S.indexOf('g'));
		sb.append(" ");
		sb.append(S.indexOf('h'));
		sb.append(" ");
		sb.append(S.indexOf('i'));
		sb.append(" ");
		sb.append(S.indexOf('j'));
		sb.append(" ");
		sb.append(S.indexOf('k'));
		sb.append(" ");
		sb.append(S.indexOf('l'));
		sb.append(" ");
		sb.append(S.indexOf('m'));
		sb.append(" ");
		sb.append(S.indexOf('n'));
		sb.append(" ");
		sb.append(S.indexOf('o'));
		sb.append(" ");
		sb.append(S.indexOf('p'));
		sb.append(" ");
		sb.append(S.indexOf('q'));
		sb.append(" ");
		sb.append(S.indexOf('r'));
		sb.append(" ");
		sb.append(S.indexOf('s'));
		sb.append(" ");
		sb.append(S.indexOf('t'));
		sb.append(" ");
		sb.append(S.indexOf('u'));
		sb.append(" ");
		sb.append(S.indexOf('v'));
		sb.append(" ");
		sb.append(S.indexOf('w'));
		sb.append(" ");
		sb.append(S.indexOf('x'));
		sb.append(" ");
		sb.append(S.indexOf('y'));
		sb.append(" ");
		sb.append(S.indexOf('z'));
		System.out.print(sb);
		
	}

}
