package OOPConceptPart1;

public class FunctionsinJava {

	public static void main(String[] args) {
		
		
		FunctionsinJava obj = new FunctionsinJava();
		
		obj.test();
		
		int l = obj.pqr();
		System.out.println(l);
		
		String s1=obj.qa();
		System.out.println(s1);
		
		int div=obj.division(20, 10);
		System.out.println(div);

	}
	
	//Non-static methods
	
	public void test() {
		
		System.out.println("Test method");
	}
	
	public int pqr() {
		
		System.out.println("PQR Method");
		
		int a = 10;
		int b = 20;
		int c = a+b;
		
		return c;
	}
	
	public String qa() {
		
		System.out.println("QA method");
		String s = "Selenium";
		
		return s;
	}
	
	public int division(int x, int y) {
		
		System.out.println("Division method");
		int d=x/y;
		
		return d;
	}
}
