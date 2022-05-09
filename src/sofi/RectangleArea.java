package sofi;

//Demo of Constructor Method :: Parameterized Constructor

class RectangleDemo
{
	//Instance variables
	int length;
	int width;
	
	//Constructor Method :: Parameterized Constructor 
	RectangleDemo(int x, int y)
	{
		length = x;
		width = y;
	}
	
	//Method For Area
	int rectArea()
	{
		return (length * width);
	}
}

public class RectangleArea {

	public static void main(String[] args) {
		
		//Instantiate an object
		RectangleDemo obj1 = new RectangleDemo(20, 60);
		int area = obj1.rectArea();
		
		System.out.println("Area Of Rectangle :: " + area);
		
	}

}
