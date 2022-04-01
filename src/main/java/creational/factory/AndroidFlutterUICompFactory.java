package creational.factory;

import java.util.ArrayList;
import java.util.List;

public class AndroidFlutterUICompFactory implements FlutterUICompFactory {

	public List createList() {
		return new ArrayList();
	}

}
