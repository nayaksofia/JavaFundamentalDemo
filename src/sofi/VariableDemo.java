package sofi;

public class VariableDemo {

	public static void main(String[] args) {
		
		//int, float , double
		
		long l = 5000000000l;
		int i = 5; //4 bytes ->32 bits
		short s = 5; //2 bytes -> 16 bits
		byte b = 5 ; //1 byte --> 8 bit --> -128 to 127
		float f = 5.5f;
		double d =5.5;
		
		char c ='A';
		c =66; //ASCII Value of B 
		
		System.out.println(c);
		
		double d1 = 5; //implicit conversion 
		System.out.println(d1);
		
		int k = (int) 5.6;  //type casting [Explicit conversion]
		System.out.println(k);
	}

}
