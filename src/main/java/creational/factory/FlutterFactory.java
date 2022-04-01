package creational.factory;

public interface FlutterFactory {
	
	public void startApp();
	
	public void initializeApp();
	
	public Button getButton();
	
	public FlutterUICompFactory getUICompFactory();

}
