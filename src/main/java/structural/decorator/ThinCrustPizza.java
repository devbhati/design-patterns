package structural.decorator;

import java.util.ArrayList;
import java.util.List;

public class ThinCrustPizza implements Pizza {
	
	int price;
	
	List<String> items = new ArrayList();

	public List<String> getItems() {
		return items;
	}

	public int getPrice() {
		return price;
	}
	
	public void addPrice(int value) {
		price += value;
	}
	
	public void addItems(String item) {
		items.add(item);
	}

	@Override
	public String toString() {
		return "ThinCrustPizza [price=" + price + ", items=" + items + "]";
	}

}
