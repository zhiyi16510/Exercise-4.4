package Exercise4_4;

public class Apple extends Fruits {
	private int quantity;
	private double price, discount;
	
	public Apple() {
		super();
		price=0;
		quantity=0;
		discount=0;
	}
	
	public Apple(String n, String t, int q, double p, double d) {  //constructor with 5 arguments
		super(n, t);
		quantity = q;
		price = p;
		discount = d;
		
		System.out.print("\nFruit\t\t: " +n);
		if(quantity<5) {
			System.out.printf("\nQuantity less than 5, total price is RM%.2f", totalPrice());
		}
		else if(quantity<=30 && quantity >=5) {
			System.out.printf("\nQuantity more than 5, total price is RM%.2f", totalPrice(3.2));
		}
		else {
			System.out.printf("\nQuantity more than 30, total price is RM%.2f", totalPrice(2.4, 0.10)
								+"\nYou get a discount of 10%");
		}
	}
	
	public double totalPrice() { // overloading without parameter
		return price*quantity;
	}
	
	public double totalPrice(double pp) { // overloading with 1 parameter
		return pp*quantity;
	}
	
	public double totalPrice(double p3, double d) { // overloading with 2 parameter
		return (p3*quantity)*(1-d);
	}
	
	public String printUses() { // overriding method
		return "\nApples contain compounds that can help fight asthma";
	}
	
	public String toString() { //overriding method
		return printUses();
	}
	
}
