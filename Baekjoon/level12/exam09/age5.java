package level12.exam09;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;
import java.util.StringTokenizer;

public class age5 {
	
	// √‚¿˙ : https://www.acmicpc.net/problem/10814

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		
		Person[] p = new Person[N];
		
		StringTokenizer token;
		for(int i=0; i<N; i++) {
			token = new StringTokenizer(br.readLine()," ");
			int age = Integer.parseInt(token.nextToken());
			String name = token.nextToken();
			p[i] = new Person(age, name);
		}
		
		br.close();
		
		Arrays.sort(p, new Comparator<Person>() {

			@Override
			public int compare(Person o1, Person o2) {
				return o1.age - o2.age;
			}
		});
		
		StringBuilder sb = new StringBuilder();
		for(int i=0; i<N; i++) {
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
