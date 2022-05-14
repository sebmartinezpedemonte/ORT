package exercises.first.lesson;

public class IdentifyMyPartsMain {

	public static void main(String[] args) {
	
			IdentifyMyParts a = new IdentifyMyParts();
			IdentifyMyParts b = new IdentifyMyParts();

			a.y = 5;
			b.y = 6;
			
			//a.x = 1;
			//b.x = 2;

			System.out.println("a.y = " + a.y); //5
			System.out.println("b.y = " + b.y); //6
			//System.out.println("a.x = " + a.x); //2
			//System.out.println("b.x = " + b.x); //2
			System.out.println("IdentifyMyParts.x = " + IdentifyMyParts.x);
			
			
			

	}

}
