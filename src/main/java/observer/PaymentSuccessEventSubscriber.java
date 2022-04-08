package observer;

public interface PaymentSuccessEventSubscriber {
	
	void notify(String order_id);

}
