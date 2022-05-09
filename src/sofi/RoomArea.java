package sofi;

//Demo Of Method Overloading

class Room
{
	//Define Instance Variable
	double length;
	double breadth;
	
	//Define Constructor-1 
	Room (double x, double y){
		length = x;
		breadth = y;
	}
	
	//Define Constructor-2
	Room (double x)
	{
		length =x;
		breadth =x;
	}
	
	//Define a method that calculate area
	
	double area()
	{
		double roomArea = length * breadth;
		System.out.println("Area Of The Room :: " + roomArea );
		return roomArea;
		
		
	}
	
}
public class RoomArea {

	public static void main(String[] args) {
		//Instantiate object 
		Room room1 = new Room(25.0 , 28.0); // calling constructor-1
		
		Room room2 = new Room(25.0); //calling constructor-2
		
		double area1 = room1.area();
		double area2 = room2.area();

	}

}

/*Notes: 
 * In Method overloading return type does not play any role 
 */

