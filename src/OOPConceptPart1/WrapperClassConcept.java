package OOPConceptPart1;

public class WrapperClassConcept {

	public static void main(String[] args) {
		
		String x = "100";
		System.out.println(x+20);
		
		//data conversion: String to int
		int i = Integer.parseInt(x);
		System.out.println(i+20);
		
		//STring to double conversion
		String y = "12.33";
		Double d = Double.parseDouble(y);
		System.out.println(d+20);
		
		//String to boolean
		String k = "True";
		boolean b = Boolean.parseBoolean(k);
		System.out.println(b);
		
		//Int to String conversion
		
		int j = 200;
		
		System.out.println(j+20);
		
		String s = String.valueOf(j);
		
		System.out.println(s+20);

	}

}
