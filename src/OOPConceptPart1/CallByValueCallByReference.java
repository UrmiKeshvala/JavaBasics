package OOPConceptPart1;

public class CallByValueCallByReference {

	
	int p;
	int q;
	
	public static void main(String[] args) {

		
		CallByValueCallByReference obj = new CallByValueCallByReference();
		int x=10;
		int y=20;
		int z=obj.testSum(x, y);// Call by value or pass by value
		System.out.println(z);
		
		obj.p=50;
		obj.q=60;
		
		obj.swap(obj);
		
		//After swap
		System.out.println(obj.p);
		System.out.println(obj.q);
		
		

	}
	
	public int testSum(int a, int b) {
		a=30;
		b=40;
		int c = a+b;
		return c;
		
	}
	
	public void swap(CallByValueCallByReference t) {
		
		int temp;
		temp = t.p; //50
		
		t.p=t.q; //60
		t.q=temp; //50
		
	}

}
