package creational.factory;

public class FlutterAndroidFactory implements FlutterFactory {
	
	public void startApp() {
		System.out.println("Starting application...");
	}
	
	public void initializeVariables() {
		System.out.println("Initializing Variables...");
	}
	
	public AndroidButton getButton() {
		return new AndroidButton();
	}

	public void initializeApp() {
		System.out.println("Initializing Variables...");
		
	}

	public FlutterUICompFactory getUICompFactory() {
		return new AndroidFlutterUICompFactory();
	}

}
