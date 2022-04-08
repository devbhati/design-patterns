package structural.decorator.scaler;

public class ChocoScoop implements Cone {

private Cone cone;
	
	ChocoScoop(Cone cone) {
		if(cone == null) {
			throw new NullPointerException();
		}
		this.cone = cone;
	}

	public int getPrice() {
		return this.cone.getPrice() + Menu.ChocoScoopPrice;
	}

	public void printComposition() {
		this.cone.printComposition();
        System.out.println(MenuItem.ChocoScoop);
	}
}
