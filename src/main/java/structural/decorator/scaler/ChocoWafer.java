package structural.decorator.scaler;

public class ChocoWafer implements Cone {
	
	private Cone cone;
	
	ChocoWafer() {}
	
	ChocoWafer(Cone cone) {
		if(cone == null) {
			throw new NullPointerException();
		}
		this.cone = cone;
	}

	public int getPrice() {
		int cost = Menu.ChocoWaferPrice;

        if (this.cone != null) {
            cost += this.cone.getPrice();
        }

        return cost;
	}

	public void printComposition() {
		if (this.cone != null) {
            this.cone.printComposition();
        }

        System.out.println("ChocoWafer");
	}

}
