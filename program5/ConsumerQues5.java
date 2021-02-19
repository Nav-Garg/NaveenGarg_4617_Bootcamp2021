import java.util.*;
import java.util.function.Consumer;
class Product {
  	private double price = 0.0;

  	public void setPrice(double price) {
    		this.price = price;
  	}

  	public void printPrice() {
    		System.out.println(price);
  	}
}

public class ConsumerQues5 {
  	public static void main(String[] args) {
    		Consumer<Product> updatePrice = p -> p.setPrice(9.9);
    		Product p = new Product();
    		updatePrice.accept(p);
    		p.printPrice();
  	}
}
