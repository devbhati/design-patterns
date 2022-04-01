package creational.factory;

import java.util.ArrayList;
import java.util.List;

public class IOSFlutterUICompFactory implements FlutterUICompFactory {

	public List createList() {
		return new ArrayList();
	}

}
