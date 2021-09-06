package level02.exam05;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class alarmClock3 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		StringTokenizer st = new StringTokenizer(br.readLine()," ");
		br.close();
		
		int h = Integer.parseInt(st.nextToken()); // ½Ã
		int m = Integer.parseInt(st.nextToken()); // ºÐ
		
		StringBuilder sb = new StringBuilder();
		
		if(m<45) {
			h--;
			m = 60 - (45-m);
			if(h < 0) {
				h = 23;
			}
			sb.append(h + " " + m);
		} else {
			sb.append(h + " " + (m - 45));
		}
		System.out.println(sb);

	}

}
