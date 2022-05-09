package sofi;

/*Example:
 * MethodOverloading:: 
 * Multiple methods with same name but different parameters is
 * known as MethodOverloading.
 * 
 * Example:: 
 * ConstructorOverloading
 * Multiple Constructors With Different Parameters is known as Constructor Overloading.
 * 
 *  Notes On Constructor::
 *  1. Constructor allocate memory to the object.
 *  2. Constructor never return anything.
 *  3. Constructor name is same as Class name.
 *  4. Constructor is a member method.
 *  5. Every time you create an object of a class , it automatically
 *     called a constructor. 
 *  
 *  
 */
class SofiCalculator{

	// Define instance variables 
	int num1;
	int num2;
	String operation;
	
	//Example: ConstructorOverloading
	
	public SofiCalculator() {
		num1 = 0;
		num2 = 0;
		operation = "Nothing";
	}
	
	public SofiCalculator(int s) {
		num1 = s;
		num2 = 0;
		operation = "Nothing";
	}
	
    public SofiCalculator(int s, int n) {
    	num1 = s;
		num2 = n;
		operation = "Nothing";
	}
	
    public SofiCalculator(int s, int n, String op) {
    	num1 = s;
		num2 = n;
		operation = op;
	}
	
	
	//Example: MethodOverloading
    
	public void add(int i, int j) {
		System.out.println(i+j);	
	}

	public void add(int i, int j, int k) {
		System.out.println(i+j+k);
		
	}

	public void add(double d, double e) {
		System.out.println(d+e);
		
	}
	
	
	
}

public class MethodOverloadingDemo {

	public static void main(String[] args) {
		
		SofiCalculator obj = new SofiCalculator(4,3,"Sofia");
		
		System.out.println(obj.num1);
		System.out.println(obj.num2);
		System.out.println(obj.operation);
		
		obj.add(5 , 2);
		obj.add(7, 8, 3);
		obj.add(4.5, 2.1);
	}

}
