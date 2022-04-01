package structural.decorator;

import java.util.List;

public interface Pizza {
	
	int getPrice();
	
	List<String> getItems();
	
	void addPrice(int value);
	
	void addItems(String item);

}
