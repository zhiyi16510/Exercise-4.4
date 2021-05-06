package Exercise4_4;

public class Papaya extends Fruits{
	private String country, colour;
	private double price;
	
	public Papaya() {
		super();
		country = "";
		colour = "";
		price = 0;
	}
	
	public Papaya(String n, String t, String c, String col, double p) {  //constructor with 5 arguments
		super(n, t);
		country = c;
		colour = col;
		price = p;
		
		System.out.print("\nFruit\t\t: " +n);
		switch(country) {
		case "Mexico":
			System.out.print(info("Mexico", "Orange", 12));
			break;
		case"Hawaii":
			System.out.print(info("Hawaii", "Orange", 8));
			break;
		}
	}
	
	public String info() { //overloading
		return "\nCountry\t\t: "+country+"\nColour\t\t: "+colour+"\nPrice\t\t: "+price;
	}
	
	public String info(String c, String col) {  //overloading with 2 argument
		return "\nCountry\t\t: "+c+"\nColour\t\t: "+col+"\nPrice\t\t: "+price;
	}
	
	public String info(String c, String col, double p) {  //overloading with 3 argument
		return "\nCountry\t\t: "+c+"\nColour\t\t: "+col+"\nPrice\t\t: RM"+p;
	}
	
	public String printUses() {
		return "\nPapaya may reduce the risk of heart disease";
	}
	
	public String toString() {  //overriding
		return printUses();
	}
}
