package JavaBasics;

public class TwoDimArray {

	public static void main(String[] args) {
		
		String x[][] = new String[3][5];
		
		System.out.println(x.length); //3 (total no. of rows)
		System.out.println(x[0].length); // total no. of columns
		
		x[0][0] = "A";
		x[0][1] = "B";
		x[0][2] = "C";
		x[0][3] = "D";
		x[0][4] = "E";
		
		x[1][0] = "A1";
		x[1][1] = "B1";
		x[1][2] = "C1";
		x[1][3] = "D1";
		x[1][4] = "E1";
		
		x[2][0] = "A2";
		x[2][1] = "B2";
		x[2][2] = "C2";
		x[2][3] = "D2";
		x[2][4] = "E2";
		
		System.out.println(x[1][2]);
		System.out.println(x[2][2]);
		System.out.println(x[0][4]);
		
		
		System.out.println("***************************");
		
		
		//Print all the values of 2D array
		
		for(int row=0; row<x.length; row++)
		{
			for (int column =0; column<x[0].length; column++) {
				System.out.println(x[row][column]);
			}
		}
		

	}

}
