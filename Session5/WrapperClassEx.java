package Session5;

public class WrapperClassEx {
	
	public static void main(String[] args) {
		
		//Converting Primitive to Wrapper Class
		int a = Integer.valueOf(50); 
		
		Integer intObj = 50;//Equivalent to Integer.valueOf(50);
		
		Character charObj = 'A';
		
		Double dObj = 25.35478;
		
		System.out.println(a);
		System.out.println(intObj);
		System.out.println(charObj);
		System.out.println(dObj);
		
		System.out.println("-----------------------------------------------");
		
		//Converting Wrapper class to primitive
		int value1 = intObj;
		char value2 = charObj;
		double value3 = dObj;
		
		
		System.out.println(value1);
		System.out.println(value2);
		System.out.println(value3);
		
	
	}

}
