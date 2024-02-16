package OOPConceptPart2;

public class CarTest {

	public static void main(String[] args) {
	
		
		BMW b = new BMW();
		b.start();
		b.stop();
		b.refuel();
		b.theftSafety();
		b.engine();
		
		System.out.println("***********");
		
		Car c = new Car();
		c.start();
		c.start();
		c.refuel();
		
		System.out.println("*******");
		
		//top casting 
		Car c1 = new BMW(); //Child class object can be referred by parent class reference variable --Dynamic polymorphism -- Run time polymorphism

		c1.start(); //preference will be given to child class method (BMW's method here)
		c1.stop();
		c1.refuel();
		
		//down casting is not allowed (Run time exception -- ClassCastException)
		BMW b1 = (BMW)new Car();

	}

}
