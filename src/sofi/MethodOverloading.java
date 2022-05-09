package sofi;

/* Demo: Method-overloading
 * 1. Method-overloading is the part of Polymorphism.
 * 2. Method-overloading is also known as Early Binding, Static Binding , Compile Time Polymorphism
 * 3. It has same method name  but different parameters in same class.  
 */

class A{
	//Type-1: Define method show
	public void show() {
		System.out.println("Hello World!!!");
		
	}
	
	//Type-2: Define a method with same name and different parameters
	public void show(int i) {
		System.out.println("Hello " + i);
	}
	
	//Type-3: Define a method with same name, same parameter but different type
	public void show(double d) {
		System.out.println("Hello Universe " + d);
	}
	
}

public class MethodOverloading {

	public static void main(String[] args) {
		
		//Instantiate object of class A
		A obj = new A();
		obj.show(8);
		//obj.show();
       
	}

}
