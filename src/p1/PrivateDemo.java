package p1;

//Java Program To illustrate error while using class from same package with private modifier 

class A
{
	private void display1() {
		System.out.println("Good Day!!!");
	}
}

public class PrivateDemo {

	public static void main(String[] args) {
	
		//Instantiate Object
		
		A obj = new A();
		//Trying to access private method of another class
		
		obj.display1();
     
	}

}
