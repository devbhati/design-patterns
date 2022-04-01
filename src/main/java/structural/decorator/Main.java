package structural.decorator;


public class Main {
	
	public static void main(String[] args) {
		Pizza p = new ThinCrustPizza();
		p = ExtraChicken.ExtraChicken(CheeseTopping.CheeseTopping(p));
		System.out.println(p.toString());
	}

}
