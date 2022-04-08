package observer;

public class InvoiceService implements PaymentSuccessEventSubscriber {
	
	public void sendInvoice(String order_id) {
		System.out.println("Sending invoice to"+order_id);
	}

	public void notify(String order_id) {
		sendInvoice(order_id);
	}

}
