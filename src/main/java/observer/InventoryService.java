package observer;

public class InventoryService implements PaymentSuccessEventSubscriber {
	
	public void sendInventory(String order_id) {
		System.out.println("Sending Inventory to"+order_id);
	}

	public void notify(String order_id) {
		sendInventory(order_id);
	}

}
