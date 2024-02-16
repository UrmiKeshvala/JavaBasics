package OOPConceptPart2;

public class HSBCBank implements USBank, BrazilBank{
	
	public void credit() {
		
		System.out.println("HSBC---credit");
	}
	
	public void debit() {
		
		System.out.println("HSBC---debit");
	}
	
	public void transferMoney() {
		
		System.out.println("HSBC---transferMoney");
	}
	
	public void educationLoan() {
		
		System.out.println("HSBC----educationLoan");
	}
	
	public void carLoan() {
		System.out.println("HSBC---cardLoan");
		
	}
		
		//Brazil Bank method
		
	public void mutualFund(){
			
			System.out.println("Brazil bank---mutualFund");
		
	}

}
