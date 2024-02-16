package OOPConceptPart2;

public class TestBank {

	public static void main(String[] args) {
		
		
		System.out.println(USBank.min_bal);
		
		HSBCBank hs = new HSBCBank();
		
		hs.credit();
		hs.debit();
		hs.transferMoney();
		hs.educationLoan();
		hs.carLoan();
		hs.mutualFund();
		
		//dynamic polymorphism
		//Child class object can be referred by parent interface reference variable
		
		System.out.println("**************");
		
		USBank b = new HSBCBank();
		b.credit();
		b.debit();
		b.transferMoney();
		
		

	}

}
