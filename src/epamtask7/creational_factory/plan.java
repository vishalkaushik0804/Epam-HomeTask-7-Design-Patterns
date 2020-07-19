package epamtask7.creational_factory;

public abstract class plan {
	protected double price;  
    abstract void getCost();  

    public void calculateBill(int kgs)
    {  
         System.out.println(kgs*price);  
    }
}
