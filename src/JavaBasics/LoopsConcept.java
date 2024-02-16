package JavaBasics;

public class LoopsConcept {

	public static void main(String[] args) {
		
		//while loop
		
		int i = 1; //initialization
		
		while(i<=10) { //Conditional part
			System.out.println(i);
			i=i+1; //increment/decrement 
		}
		
		System.out.println("*********************");
		
		//for loop
		
		for(int j=1; j<=10; j++) { //initialization, conditional, Increment/decrement
			System.out.println(j); 
		}
		
		System.out.println("*********************");
		// 10 to 1
		
		for(int k=10; k>=1; k--) {
			
			System.out.println(k); 
		}

	}

}
