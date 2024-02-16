package JavaBasics;

public class IfelseBasics {

	public static void main(String[] args) {
	
		int a = 10;
		int b = 20;
		
		if(b>a) {
			System.out.println("b is greater than a");
		}else
		{
			System.out.println("a is greater than b");
		}
// Comparison operators < > <= >= !=
		
		int c = 40;
		int d = 40;
		
		if(c==d) {
			System.out.println("c and d are equal");
		}else {
			System.out.println("c and d are not equal");
		}
		
		int a1 = 300;
		int b1 = 400;
		int c1 = 500;
		
		if(a1>b1 & a1>c1) { //false and false = false
			System.out.println("a1 is the gratest");
		}else if(b1>c1) {
			System.out.println("b1 is the gratest");
		}
		else {
			System.out.println("C1 is the gratest");
		}
	}

}
