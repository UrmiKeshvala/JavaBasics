package OOPConceptPart2;

public class BMW extends Car {
	
	
	//Same method in both Parent and Child class (Same name and same arguments) is called method overriding
	
	public void start() { //Overridden method 
		
		System.out.println("BMW----start");
	}
	
	public void theftSafety() {
		
		System.out.println("BMW----TheftSafety");
	}

}
