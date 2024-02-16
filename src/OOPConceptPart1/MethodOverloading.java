package OOPConceptPart1;

public class MethodOverloading {

	public static void main(String[] args) {
		
		MethodOverloading obj = new MethodOverloading();
		
		obj.sum();
		obj.sum(5);
		obj.sum(5,5);

	}
	
	//Method inside method is not allowed in Java
	//Duplicate methods i.e., same method name and same arguments not allowed within same class
	
	
	public void sum() {
		System.out.println("Sum menthod 0 parameters");
		}
	
	public void sum(int i) {
		
		System.out.println("Sum menthod 1 parameters");
		System.out.println(i);
	}
	
	public void sum(int k, int l) {
		
		System.out.println("Sum menthod 2 parameters");
		System.out.println(k+l);
		
	}

}
