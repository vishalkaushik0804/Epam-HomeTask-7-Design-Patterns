package epamtask7.creational_abstractFactory;

abstract class AbstractFactory{  
	  public abstract Bank getBank(String bank);  
	  public abstract Loan getLoan(String loan);  
	}  