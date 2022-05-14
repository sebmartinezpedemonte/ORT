package exercise.second.lesson;

public class TestAuthor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Author anAuthor = new Author("Charles Darwin", "CW@gmail.com", 'm');
		System.out.println(anAuthor);
		anAuthor.setEmail("CW@hotmail.com");
		System.out.println(anAuthor);

	}

}
