package structural.decorator.self;

import java.util.ArrayList;
import java.util.List;

public class ThickCrustPizza implements Pizza {
	
	int price;
	
	List<String> items = new ArrayList();

	public int getPrice() {
		return 0;
	}

	public List<String> getItems() {
		return items;
	}

	public void addPrice(int value) {
		price += value;
	}
	
	public void addItems(String item) {
		items.add(item);
	}
	
}
