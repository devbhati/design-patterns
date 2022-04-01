package creational.factory;

public class FlutterFactoryClass {
	
	public static FlutterFactory createBasedOnPlatform(Platform platform) {
		switch(platform) {
			case IOS: {
				return new FlutterIOSFactory();
			}
			case Android: {
				return new FlutterAndroidFactory();
			}
		}
		return null;
	}

}
