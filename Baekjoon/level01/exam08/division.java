package level01.exam08;

import java.util.Scanner;

public class division {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		double a = scanner.nextDouble(); // 예제 출력에서는 실수의 값을 원한다.
		double b = scanner.nextDouble();
		scanner.close();
		
		System.out.println(a / b);

	}

}
