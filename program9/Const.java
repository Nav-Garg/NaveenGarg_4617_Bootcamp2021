enum House {
   House101(900000),House103(150000),House105(5000000),House111(356000),House114(1000002);
   int price;
   House(int p) 
   {
      price = p;
   }
   int getPrice() 
   {
      return price;
   } 
}
public class Const {
   public static void main(String args[]){
      System.out.println("All House prices:");
      for (House c : House.values()) 
	System.out.println(c + " costs " + c.getPrice() + " Rupees.");
   }
}
