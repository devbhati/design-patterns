package structural.decorator.scaler;

public class VanillaScoop implements Cone {

private Cone cone;
	
	VanillaScoop(Cone cone) {
		if(cone == null) {
			throw new NullPointerException();
		}
		this.cone = cone;
	}

	public int getPrice() {
		return this.cone.getPrice() + Menu.VanillaScoopPrice;
	}

	public void printComposition() {
		this.cone.printComposition();
        System.out.println(MenuItem.VanillaScoop);
	}
}
