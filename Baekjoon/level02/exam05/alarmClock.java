package level02.exam05;

import java.util.Scanner;

public class alarmClock {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int h = sc.nextInt(); // ½Ã
		int m = sc.nextInt(); // ºÐ
		sc.close();
		
		if(m<45) {
			h--;
			m = 60 - (45-m);
			if(h < 0) {
				h = 23;
			}
			System.out.println(h + " " + m);
		} else {
			System.out.println(h + " " + (m - 45));
		}

	}

}
