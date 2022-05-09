package sofi;
// Demo of Single Level and Multi Level Inheritance

class Add {
	//Declare Instance Variable
	int num1 , num2, result;
	
	public void sum(){
		
		result = num1 + num2 ;
		System.out.println("Addition :: " + result);
		
	}
}

class AddSub extends Add{  //single level inheritance 
	
	public void sub() {
		result = num1 - num2;
		System.out.println("Subtraction :: " + result);
	}
}

class AddSubMul extends AddSub{  //Multi Level Inheritance
	
	public void mul() {
		
		result = num1 * num2 ;
		System.out.println("Multiplication :: " + result);
		
	}
	
}

public class InheritanceDemoOne {

	public static void main(String[] args) {
		
		//Instantiate Object
		AddSubMul obj1 = new AddSubMul();
		obj1.num1 = 6;
		obj1.num2 = 5;
		//Invoke the methods
		obj1.sum();
		obj1.sub();
		obj1.mul();
       
	}

}
