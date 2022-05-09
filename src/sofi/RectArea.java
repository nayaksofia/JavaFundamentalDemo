package sofi;

//Demo Of Accessing Class Members 

class Rectangle
{
	//Declare Instance variables
	int length;
	int width;
	
  // Method One :: No return type
	void getData(int x, int y) {
		length = x;
		width = y;
	}
	
  // method Two :: Having return type
	int rectArea()
	{
		int area = length * width;
		return(area);
	}
}

public class RectArea {

	public static void main(String[] args) {
		int area1 , area2 ;
		
		//Instantiate Object
		Rectangle rect1 = new Rectangle();
		Rectangle rect2 = new Rectangle();
		

		//One Way : Accessing Variable
	    rect1.length = 10;
	    rect1.width = 20;
	    area1 = rect1.length * rect1.width;
	    System.out.println("Area One ::  " + area1);
	    
	    //Second Way : Accessing Variables
	    rect2.getData(30, 20);
        area2 = rect2.rectArea();
        System.out.println("Area Two :: " + area2);
	}

}
