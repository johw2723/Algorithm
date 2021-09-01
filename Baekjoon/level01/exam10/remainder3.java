package level01.exam10;

import java.util.Scanner;

public class remainder3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
	       
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        
        sc.close();
        
        StringBuilder sb = new StringBuilder();
        sb.append((a+b)%c);
        sb.append("\n");
        sb.append((a%c + b%c)%c);
        sb.append("\n");
        sb.append((a*b)%c);
        sb.append("\n");
        sb.append((a%c * b%c)%c);
        
        System.out.println(sb);

	}

}
