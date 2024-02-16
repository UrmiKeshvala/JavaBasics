package OOPConceptPart2;

public interface USBank {
	
	int min_bal=100;
	
	public void credit(); 
	
	public void debit();
	
	public void transferMoney();
	
	//Only declaration of the method in interface, no method body
	//Can declare the variables and they are by default static 
	//variable value cannot be changed
	//No static method in interface
	//No main method in interface
	//Cannot create an object of interface
	//Abstract in nature (We cannot instantiate)
	
	
	

}
