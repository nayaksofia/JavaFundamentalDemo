package sofi;
// Demo of Encapsulation
/*
 * Encapsulation :: Binding the data with the methods
 * 1. Varibales must be private.
 * 2. Method i.e getter and setter methods must be declared public
 */
class Enc{
	//Declare instance variables and it is private
	private int rollno;
	private String name;
	
	//Generate getter and setter 
	public int getRollno() {
		return rollno;
	}
	public void setRollno(int rollno) {
		this.rollno = rollno;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	
}


public class EncapsulationDemo {

	public static void main(String[] args) {
		//Generate instance of class Enc
		Enc obj = new Enc();
		
		//Set values to those variable
		obj.setRollno(1001);
		obj.setName("Sofia");
		
		//Get values of those variables
		System.out.println("Roll No:: " + obj.getRollno());
		System.out.println("Name of The Student:: " + obj.getName());

	}

}
