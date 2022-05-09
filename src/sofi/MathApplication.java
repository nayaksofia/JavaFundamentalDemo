package sofi;

//Defining and Using static members

//Define a class
class MathOperation
{
	//Define static methods
	static double mul(double x , double y) {
		return x*y;
	}
	
	static double devide(double x , double y) {
		return x/y;
	}
}


public class MathApplication {

	public static void main(String[] args) {
		
		double a = MathOperation.mul(2.0, 4.0);
		double b = MathOperation.devide(a, 2.0);
		System.out.println("Value of b =  " + b);
	}

}
