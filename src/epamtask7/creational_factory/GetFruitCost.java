package epamtask7.creational_factory;

public class GetFruitCost {
	public plan getFruit(String fruitType){  
        if(fruitType == null){  
         return null;  
        }  
      if(fruitType.equalsIgnoreCase("ORANGE")) {  
             return new Orange();  
           }   
       else if(fruitType.equalsIgnoreCase("APPLE")){  
            return new Apple();  
        }   
      else if(fruitType.equalsIgnoreCase("GRAPES")) {  
            return new Grapes();  
      }  
  return null;  
}  
}
