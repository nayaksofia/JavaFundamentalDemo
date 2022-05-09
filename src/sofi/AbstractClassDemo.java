package sofi;

//Abstract Class And Abstract Method Demo
/*Remember::
 * 1. When a class has abstract method, that class is also known as 
 * abstract class. We use the keyword 'abstract' in both methods and class.
 * 
 * 2. We can't create the object of abstract class i.e we can't instantiate
 * the abstract class.
 */
abstract class MaheshPhone{ //Abstract Class
	
	public void call() {   //Define Method call()
		System.out.println("Calling.........");
	}
	
	//Let Declare Methods 
	public abstract void move(); //i.e abstract method
	public abstract void dance(); //i.e abstract method
	public abstract void cook(); //i.e abstract method
}
//When we extend an abstract class , we have to define (compulsory) all the abstract methods of that abstract class  
//We overriding the above methods
abstract class RameshPhone extends MaheshPhone 
{
	public void move() { 
		System.out.println("Moving.........");
	}
	
	
}

//Now SureshPhone has all defined methods  
class SureshPhone extends RameshPhone  //Concrete class
{
	public void dance() {
		
		System.out.println("Dancing...........");
	}
	
	public void cook() {
		System.out.println("Cooking...........");
	}
}

public class AbstractClassDemo {

	public static void main(String[] args) {
		
		//MaheshPhone obj1 = new MaheshPhone();  //Can not instantiate the abstract class		
		//obj1.call();
		
		MaheshPhone obj2 = new SureshPhone();
		
		//Now we call all the method using 
		obj2.call();
		obj2.dance();
		obj2.cook();
		obj2.move();
	}

}
