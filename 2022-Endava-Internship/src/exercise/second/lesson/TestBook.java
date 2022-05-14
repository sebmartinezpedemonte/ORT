package exercise.second.lesson;

public class TestBook {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Author anAuthor = new Author("Charles Darwin", "CW@gmail.com", 'm');
		Book aBook = new Book("On The Origin of Species", anAuthor, 1);

		aBook.setPrice(100.50);

		System.out.println(aBook);
		System.out.println(aBook.getAuthor().getName());
		System.out.println(aBook.getAuthor().getEmail());
		System.out.println(aBook.getAuthorGender());


		}
		 
		
	}


