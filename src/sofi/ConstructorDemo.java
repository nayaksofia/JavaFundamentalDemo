package sofi;

class Calculator{
	
	//Declare Variable Name
	int num1;
	int num2;
	int result;
	
	//Define Default Constructor; Without parameter
	public Calculator() {
		num1 = 5;
		num2= 6;
		System.out.println("in constructor");
	}
	
	//Define parameterized constructor of same class
	public Calculator(int n) {
		
		num1 = n;
		num2= n;
	}
	
	//Third constructor
	public Calculator(double d, int s) {
		num1 =(int) d; //TypeCasting
		num2 = s;
	}
}


public class ConstructorDemo {

	public static void main(String[] args) {
		
		Calculator Obj1 = new Calculator(8.7, 9); //Calculator :: is a constructor  which allocating memory
	
	    System.out.println(Obj1.num1); 
	}

}
