package creational.singleton;

public class Singleton {
	
	private static Singleton singleton = null;
	
	private Singleton() {}
	
	public static Singleton getInstance() {
		if(null==singleton) {
//			synchronized(singleton) {  // synchronizing only the flow where the object is created
				if(null==singleton) {
						singleton = new Singleton();
					}
//				}
		}
		return singleton;
	}

}
