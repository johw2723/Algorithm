package level12.exam09;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class age4 {
	
	// ���� : https://www.acmicpc.net/problem/10814

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		
		Person[] p = new Person[N];
		
		for(int i=0; i<N; i++) {
			p[i] = new Person(sc.nextInt(), sc.next());
		}
		
		sc.close();
		
		Arrays.sort(p, new Comparator<Person>() {

			@Override
			public int compare(Person o1, Person o2) {
				// ���̼����� ����
				return o1.age - o2.age;
			}
			
		});
		
		StringBuilder sb = new StringBuilder();
		for(int i=0; i<N; i++) {
			// ��ü�迭�� ��ü�� ����ϸ� �ش� �ε��� ��ü�� toStirng()�� ��µȴ�.
			sb.append(p[i]);
		}
		
		System.out.print(sb);
	}
	
	public static class Person {
		int age;
		String name;
		
		public Person(int age, String name) {
			this.age = age;
			this.name = name;
		}
		
		@Override
		public String toString() {
			return age + " " + name + "\n";
		}
	}

}
