package creational.factory;

public class FlutterIOSFactory implements FlutterFactory {

	public void startApp() {
		// TODO Auto-generated method stub
		
	}

	public void initializeApp() {
		// TODO Auto-generated method stub
		
	}

	public Button getButton() {
		// TODO Auto-generated method stub
		return null;
	}

	public FlutterUICompFactory getUICompFactory() {
		return new IOSFlutterUICompFactory();
	}

}
