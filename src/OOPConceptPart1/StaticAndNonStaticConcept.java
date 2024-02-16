package OOPConceptPart1;

public class StaticAndNonStaticConcept {
	
	String name = "Tom"; //Non static global variable
	static int age = 25; //static global variable
	

	public static void main(String[] args) {
		
		// How to call static methods and variables
		//1. direct calling
		sum();
		
		//2. Calling by class name 
		StaticAndNonStaticConcept.sum();
		
		System.out.println(age);
		System.out.println(StaticAndNonStaticConcept.age);
		
		StaticAndNonStaticConcept obj = new StaticAndNonStaticConcept();
		obj.sendMail();
		System.out.println(obj.name);

	}
	
	public void sendMail() {
		
		System.out.println("Send mail method");
	}
	
	public static void sum() {
		
		System.out.println("Sum method");
	}

}
