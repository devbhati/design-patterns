package structural.decorator.scaler;

public class Strawberry implements Cone {

private Cone cone;
	
	Strawberry(Cone cone) {
		if(cone == null) {
			throw new NullPointerException();
		}
		this.cone = cone;
	}

	public int getPrice() {
		return this.cone.getPrice() + Menu.Strawberry;
	}

	public void printComposition() {
		this.cone.printComposition();
        System.out.println(MenuItem.Strawberry);
	}
}
