package sofi;

class ABCImpl implements ABC
{

	@Override
	public void show() {
		System.out.println("In show....");
		
	}
	
}

public class InterfaceDemo {

	public static void main(String[] args) {
		
		ABC obj = new ABCImpl();
		obj.show();
		
	}

}
