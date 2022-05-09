package sofi;

class Calc{
	
	int num1;
	int num2;
	int result;
	
	public void addition(){
		
		result = num1 + num2 ;
	}
}




public class ObjectDemo {

	public static void main(String[] args) {
		
		Calc obj1 = new Calc(); //obj1 act as an reference object, know sth and does sth
		
		//Assign value to the variables
		obj1.num1 = 50;
		obj1.num2 = 60;
		
		//call the method 
		obj1.addition();
		
		//Let's see the result
		System.out.println("Result = " + obj1.result);

	}

}
