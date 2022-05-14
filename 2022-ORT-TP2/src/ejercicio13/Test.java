package ejercicio13;

public class Test {
	public static void main(String[] args) {
		SuperHeroe superHeroe1 = new SuperHeroe("Batman", 90, 70, 0);
		
		SuperHeroe superHeroe2 = new SuperHeroe("Superman", 95, 60, 70);
		SuperHeroe superHeroe3 = new SuperHeroe("SupermanBizarro", 95, 60, 70);
		SuperHeroe superHeroe4 = new SuperHeroe("Guason", 60, 60, -10);
		SuperHeroe superHeroe5 = new SuperHeroe("Thanos", 1000, 1000, 1000);
		SuperHeroe superHeroe6 = new SuperHeroe("Thor", 90, 90, 60);


		
		System.out.println(superHeroe1.competir(superHeroe2));
		System.out.println(superHeroe2.competir(superHeroe1));
		System.out.println(superHeroe3.competir(superHeroe2));
		System.out.println(superHeroe4.competir(superHeroe5));
		System.out.println(superHeroe6.competir(superHeroe5));
		System.out.println(superHeroe5.competir(superHeroe2));
		
		System.out.println(superHeroe1);
		System.out.println(superHeroe2);
		System.out.println(superHeroe3);
		System.out.println(superHeroe4);
		System.out.println(superHeroe5);
		System.out.println(superHeroe6);
	}
}
