package creational;

import java.util.List;

import creational.factory.FlutterFactory;
import creational.factory.FlutterFactoryClass;
import creational.factory.FlutterUICompFactory;
import creational.factory.Platform;

public class MainClass {
	
	public static void main(String[] args) {
		
		
		
		/** Singleton design pattern
		 * Singleton s1 = Singleton.getInstance();
		 *	Singleton s2 = Singleton.getInstance();
		 *	System.out.println(s1+"  "+s2);
		 */
		
		/** Builder design pattern
		 *  Student.StudentBuilder builder = Student.getBuilder();
		 *
		 *	builder.setName("Mark")
		 *		.setAge(26)
		 *		.build();
		 */
		
		
		/**	Factory class design pattern
		*   FlutterFactory flutterAndFactory = FlutterFactoryClass.createBasedOnPlatform(Platform.Android);
		*	FlutterFactory flutterIOSFactory = FlutterFactoryClass.createBasedOnPlatform(Platform.IOS);
		*/
		
		
		/** Factory method design pattern
		 * 			FlutterAndFactory class has a method getButton to create Button class.
		 * 	FlutterFactory flutterAndFactory = FlutterFactoryClass.createBasedOnPlatform(Platform.Android);
		 * 	Button andButton = flutterAndFactory.getButton();
		 * 
		 */
			
		/**
		 * Abstract factory design
		 * 			Abstract Factory Pattern says that just define an interface or abstract class for creating 
		 * 			families of related (or dependent) objects but without specifying their concrete sub-classes.
		 * 
		 * 	FlutterFactory flutterAndFactory = FlutterFactoryClass.createBasedOnPlatform(Platform.Android);
		 *	FlutterUICompFactory flutterUICompFactory = flutterAndFactory.getUICompFactory();
		 *	List list = flutterUICompFactory.createList();
		 * 
		 */		
				
	
		
	}

}
