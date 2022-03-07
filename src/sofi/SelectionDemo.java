package sofi;

public class SelectionDemo {

	public static void main(String[] args) {
		
		String n = "abc";
		
		
	//Example :: Switch Case 
		
		switch(n)
		{
		case "abc":
			
			System.out.println("One");
			break;
		case "pqr":
			System.out.println("Two");
			break;
		case "stu":
			System.out.println("Three");
			break;
		case "wxy":
			System.out.println("Four");
			break;
		case "zzz":
			System.out.println("Five");
			break;
		default:
			System.out.println("No Match");
		
		}
		
//Note :: We can use string in JavaSE- 1.7 and later 	
		
		
//		int i=3;
//		
//		int j=0;
//		
		//Ternary Operator ? : ---> condition ? expr1 : expr2
		
//		 j = i>6?1:2;
//		 
//         System.out.println(j);
//		
		//if----else
		
//		if(n%2==0) {
//			System.out.println("It's an Even Number");
//		}else {
//			System.out.println("It's an Odd Number");
//		}
//		
		
		//else----if
//		if(n==0) {
//			System.out.println("Nothing");
//		}
//		else if(n%2==0) {
//			System.out.println("It's an even number");
//		}else {
//			System.out.println("It's an  odd number");
//		}

	}
		

}
