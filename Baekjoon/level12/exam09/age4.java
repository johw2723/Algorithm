package level12.exam09;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class age4 {
	
	// 출저 : https://www.acmicpc.net/problem/10814

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
				// 나이순으로 정렬
				return o1.age - o2.age;
			}
			
		});
		
		StringBuilder sb = new StringBuilder();
		for(int i=0; i<N; i++) {
			// 객체배열의 객체를 출력하면 해당 인덱스 객체의 toStirng()이 출력된다.
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
