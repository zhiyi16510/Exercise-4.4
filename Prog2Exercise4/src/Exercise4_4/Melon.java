package Exercise4_4;

public class Melon extends Fruits {
	private char size;
	private int quantity, calories;
	private double price;
	
	public Melon() {
		super();
		size = ' ';
		quantity = 0;
		calories = 0;
		price = 0;
	}
	
	public Melon(String n, String t, char s, int q, int ca, double p) { //constructor with 6 arguments
		super(n, t);
		size = s;
		quantity = q;
		calories = ca;
		price = p;
		
		System.out.print("\nFruit\t\t: " +n);
		switch(size) {
		case 'S':
			System.out.print("\nTotal calories of "+size+" melon is "+totalCalories()+" kcal");
			break;
		case 'M':
			System.out.print("\nTotal calories of "+size+" melon is "+totalCalories(5)+" kcal");
			break;
		case 'L':
			System.out.print("\nTotal calories of "+size+" melon is "+totalCalories(7)+" kcal");
			break;
		}
	}
	
	public int totalCalories() {  //overloading with no argument
		return calories;
	}
	
	public int totalCalories(int q) {  //overloading with 1 argument
		return calories*q;
	}
	
	public String printUses() {  //overriding
		return "\nMelon could help in reducing blood pressure";
	}
	
	public String toString() {
		return printUses();
	}
}
