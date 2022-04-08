package structural.decorator.scaler;

public class Client {

	public static void main(String[] args) {
		Cone cone = new Strawberry(
                new VanillaScoop(new ChocoScoop(
                new VanillaScoop(
                        new ChocoWafer()
                ))));
		
		System.out.println(cone.getPrice());
        cone.printComposition();
        
	}
}
