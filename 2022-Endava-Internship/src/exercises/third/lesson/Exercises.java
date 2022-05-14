package exercises.third.lesson;

public class Exercises {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] numbers = new int[4];
		numbers[0] = 1;
		numbers[1] = 2;
		numbers[2] = 3;
		numbers[3] = 4;
		for (int i = 0; i < numbers.length; i++) {
			System.out.println(numbers[i]);
		}
		
		String greeting = "Hello";
		String secondGreeting = "Hello";
		boolean really;
		really = greeting.equals(secondGreeting);
		System.out.println(really);
		
		String name = "John";
		String lastName = " Doe";
		
		String fullname = name.concat(lastName);
		System.out.println(fullname);

	}
}
