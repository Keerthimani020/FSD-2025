package session3;

public class AccessEncapsulation {
	
	public static void main(String[] args) {
		Encapsulation ee = new Encapsulation();
		ee.setName("Keerthi");
		ee.setLocation("Salem");
		
		System.out.println(ee.getName());
		System.out.println(ee.getLocation());
	}

}
