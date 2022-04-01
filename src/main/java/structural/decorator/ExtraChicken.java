package structural.decorator;

public class ExtraChicken {
	
private static Pizza pizza;
	
	private static int cost = 100;
	
	private static String title = "Chicken";
	
	static Pizza ExtraChicken(Pizza p) {
		pizza = p;
		pizza.addPrice(cost);
		pizza.addItems(title);
		return pizza;
	}

}