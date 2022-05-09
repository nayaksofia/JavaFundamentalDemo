package p2;
import p1.*;

//To illustrate public access modifier

public class PublicDemoNew extends PublicDemo {

	public static void main(String[] args) {
		
		//Instantiate object
		
		PublicDemo obj = new PublicDemo();
		obj.displaySth();
	}

}
