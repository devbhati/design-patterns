package structural.decorator;

public class CheeseTopping {
	
	private static Pizza pizza;
	
	private static int cost = 50;
	
	private static String title = "Cheese";
	
	public static Pizza CheeseTopping(Pizza p) {
		pizza = p;
		pizza.addPrice(cost);
		pizza.addItems(title);
		return pizza;
	}
}
