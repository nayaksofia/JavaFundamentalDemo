package p2;
import p1.*;

//Java program to illustrate error while using class from different package with default access modifier
public class DefaultAccessNew {

	public static void main(String[] args) {
		
        //Accessing class DefaultAccess from package p1
		
		DefaultAccess obj = new DefaultAccess();
		obj.display(); 
	}

}
