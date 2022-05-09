package sofi;
/* Demo :: Method-overriding
 * 1. Method-overriding is the part of Polymorphism.
 * 2. Method-overriding is also known as Late Binding, Dynamic Binding , Runtime Polymorphism
 * 3. When there is same method names, same parameters but two different classes which is linked by the concept of inheritance,
 * known as MethodOverriding.
 * The main purpose of method-overriding is to work with dynamic method dispatch.
 */

class Ax {               //parent class
	//Define a Method
	public void show() {
		
		System.out.println("Good Morning Universe!!!");
	}
}

class Ay extends Ax{
	//Define a Method
		public void show() {
			
			System.out.println("Keep Coding Consistently..........");
		}
}
public class MethodOverriding {

	public static void main(String[] args) {
	
     //instantiate object of subclass Ay
		Ay boj = new Ay();
		boj.show();
	}

}
