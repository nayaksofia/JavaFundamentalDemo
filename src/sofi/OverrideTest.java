package sofi;

//Illustration of method overriding

class Super
{
	//Define Instance Variable
	int x;
	
	//Define Constructor 
	
	Super(int x)
	{
		this.x = x;
	}
	
	//Define A Method 
	
	void display()
	{
		System.out.println("Super X = " + x);
	}
}

class Sub extends Super
{
	//Instance Variable Of Subclass
	int y;
	
	//Define constructor of subclass
	Sub(int x, int y)
	{
		super(x); //Passing
		this.y = y;
	}
	
	//Define Method Again Which has same name as superclass, same retun type and parameter
	
	void display() {
		System.out.println("Super X :: " + x);
		System.out.println("Super Y :: " + y);
	}
	
}

public class OverrideTest {

	public static void main(String[] args) {

		//Instantiate Object Based On Sub Class
		Sub s1 = new Sub(100 , 200);
		s1.display();
		

	}

}
