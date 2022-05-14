package exercises.third.lesson;


import java.util.HashSet;
import java.util.Iterator;

import java.util.Random;
import java.util.Set;

public class PersonMain {

	public static void main(String[] args) {

		Set<Person> persons = new HashSet<>();
		Random r = new Random();

		for (int i = 0; i < 1000; i++) {
			Person person = new Person(i, "Person" + i, r.nextInt(100));
			persons.add(person);
		}
		
		Iterator <Person> it = persons.iterator();
		while(it.hasNext()) {
			System.out.println(it.next().toString());
		}
		

	}
}