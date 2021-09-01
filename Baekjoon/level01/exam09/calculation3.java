package level01.exam09;

import java.util.Scanner;

public class calculation3 {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        
        sc.close();
        
        StringBuilder sb = new StringBuilder();
        sb.append(a+b);
        sb.append("\n");
        sb.append(a-b);
        sb.append("\n");
        sb.append(a*b);
        sb.append("\n");
        sb.append(a/b);
        sb.append("\n");
        sb.append(a%b);
        
        System.out.println(sb);
	}
}
