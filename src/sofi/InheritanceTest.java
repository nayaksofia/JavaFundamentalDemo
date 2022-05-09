package sofi;

// Demo Of Single Inheritance

//Parent Class
class RoomSo
{
	//Define Instance Variable
	int length;
	int breadth;
	
	//Define Constructor
	RoomSo(int x ,int y){
		length =x;
		breadth =y;
	}
	
	//Define method to calculate Area
	int area(){
		return(length * breadth);
	}
}

//Child class
class BedRoom extends RoomSo{   //Inheriting RoomSo
	//Define instance variable
	int height;
	//Define Constructor :: Subclass constructor 
	BedRoom(int x, int y, int z){
		super(x,y); //Pass values to super class
		height = z;
	}
	
	//Define method to Calculate Volume
	int volume() {
		return(length * breadth * height);
	}
}
public class InheritanceTest {

	public static void main(String[] args) {
		//Instantiate object of Subclass
		BedRoom Broom1 = new BedRoom(12, 23, 10);
		int area1 = Broom1.area();
		int volume1 = Broom1.volume();
		
		System.out.println("Area :: " + area1);
		System.out.println("Volume :: " + volume1);
	}

}
