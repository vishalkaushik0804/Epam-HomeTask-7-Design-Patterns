
package epamtask7.creational_factory;
import java.io.*;

public class GenerateFruitCost {
	public static void main(String args[])throws IOException{  
	      GetFruitCost fruitFactory = new GetFruitCost();  
	        
	      System.out.print("Enter the name of the fruit you would like to buy ");  
	      BufferedReader br=new BufferedReader(new InputStreamReader(System.in));  
	  
	      String fruitName=br.readLine();  
	      System.out.print("Enter the number of kgs ");  
	      int kgs=Integer.parseInt(br.readLine());  
	  
	      plan p = fruitFactory.getFruit(fruitName);  
	      //call getRate() method and calculateBill()method of DomesticPaln.  
	  
	       System.out.print("Bill amount for "+fruitName+" of  "+kgs+" kgs is: ");  
	           p.getCost();  
	           p.calculateBill(kgs);  
	            }  

}
