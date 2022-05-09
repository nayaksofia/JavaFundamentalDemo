package sofi;

class Emp{
	int eid;
	
	int salary;
	
	String ceo;
	
	public void show() {
		System.out.println(eid + " : " + salary + " : " + ceo);
	}
}


public class StaticDemo {

	public static void main(String[] args) {
		Emp sofia = new Emp();
		sofia.eid = 8;
		sofia.salary = 100000;
		sofia.ceo="Shashank";
		
		
		Emp jack = new Emp();
		jack.eid = 9;
		jack.salary = 20000;
		jack.ceo = "Shashank";
		
		sofia.show();
		jack.show();

	}

}
