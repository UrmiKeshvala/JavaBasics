package JavaBasics;

public class ArrayConcept {

	public static void main(String[] args) {
		
		//Array: To store similar data types value in array variable
		// Lowest bound/index = 0
		// Upper bound/index = n-1 (n is the size of array)
		// Disadvantages of array: 
		// 1. Size is fixed(static array) --To overcome this issue we use Collections, ArrayList, HashTable
		// 2. Stores only similar data type values --To overcome this issue we use object array
		
		
		
		int i[] = new int[4];
		i[0] = 10;
		i[1] = 20;
		i[2] = 30;
		i[3] = 40;
		
		System.out.println(i[1]);
		System.out.println(i[2]);
		System.out.println(i[3]);
		
		System.out.println("************************");
		
	// System.out.println(i[4]); // ArrayIndexOutofBound exception
		
		System.out.println(i.length);
		
		System.out.println("************************");
		
	// Print all the values of array
		
		for(int j=0; j<i.length; j++) {
			
		System.out.println(i[j]);
		
		}
		
		//Double array
		
		double d [] = new double[3];
		d[0] = 12.33;
		d[1] = 13.44;
		d[2] = 45.55;
		
		System.out.println(d[2]);
		
		//char array
		char c[] = new char[3];
		c[0] = 'q';
		c[1] = 2;
		c[2] = '$';
		
		//Boolean array
		
		boolean b[] = new boolean[2];
		b[0] = true;
		b[1] = false;
		
		//String array
		String s[] = new String[3];
		s[0] = "test";
		s[1] = "Hello";
		s[2] = "World";
		
		System.out.println(s.length);		
				
		System.out.println(s[1]+s[2]);
		
		System.out.println("************************");
		// Object array (Object is a class) used to store different data type values
		
		Object ob[] = new Object[6];
		ob[0] = "Tom";
		ob[1] = 25;
		ob[2] = 12.33;
		ob[3] = "1/1/1990";
		ob[4] = 'M';
		ob[5] = "London";
		
		System.out.println(ob[0]);
		System.out.println(ob[5]);
		System.out.println(ob.length);
	}

}
