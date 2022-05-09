package sofi;

// Demo Of Default Constructor
class Perimeter
{
   //instance variable
	int length;
	int breadth;
	
	//Default constructor :: Non-parameterised constructor
	
	Perimeter(){
		length = 0;
		breadth = 0;
	}
	
	//Parameterised constructor
	
	Perimeter(int x , int y)
	{
		length = x;
		breadth = y;
	}
	
	//Define Method :: For Perimeter calculation
	
	void cal_perimeter()
	{
		int peri;
		peri = 2*(length + breadth);
		System.out.println("\n Perimeter of the Rectangle :: " + peri);
	}
}



public class DefaultConstructor {

	public static void main(String[] args) {
		
		//Instantiate objects
		Perimeter P1 = new Perimeter(); //Calling the default constructor
		Perimeter P2 = new Perimeter(5,10); //Calling parameterized constructor
		
		P1.cal_perimeter();
		P2.cal_perimeter();
		
	}

}
