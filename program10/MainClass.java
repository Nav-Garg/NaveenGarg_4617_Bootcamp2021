class Customer{
	int paid;
	int tokenNo;
	int orderId;
	Cashier cashier;
	void placeOrder(int money){
		//code
	}
	void waitForOrder(){
		//code
	}
	void collectOrder(){
		//code
	}
}

class Cashier{
	int amount;
	Barista barista;
	Customer customer;
	int takeOrder(int price,String order){
		return change;
	}
	Queue<Integer> createOrder(int payment,int orderId){
		return que;
	}
	boolean intimate(){
		return coffeeStatus;
	}
}

class Barista{
	Queue<Integer> orderQueue;	
	Queue<Integer> completedQueue;
	int currentOrder;
	boolean coffeeStatus;
	Cashier cashier;

	int nextOrder(){
		return orderId;
	}
	void preparingCoffee(){
		//code
	}
	void updateCompleted(int ){
		//code
	}
	boolean notifyOrder(){
		coffeeStatus;
	}
}
public class MainClass
{
	public static void main(String args[])
	{
		//code
	}
}
