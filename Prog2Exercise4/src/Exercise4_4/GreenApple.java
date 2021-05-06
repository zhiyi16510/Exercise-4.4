package Exercise4_4;

public class GreenApple extends Apple{

	public GreenApple(String n, String t, int q, double p, double d) {
		super(n, t, q, p, d);
	}
	
	public String printUses() {  //overriding
		return "\nThe pectin found in green apples can help you break down foods more efficiently";
	}
	
	public String toString() {   //overriding
		return printUses();
	}
}
