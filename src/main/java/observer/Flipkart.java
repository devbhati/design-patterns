package observer;

import java.util.ArrayList;
import java.util.List;

public class Flipkart {
	
	List<PaymentSuccessEventSubscriber> subscribers = new ArrayList();
	
	public void subscribe(PaymentSuccessEventSubscriber paymentSuccessEventSubscriber) {
		subscribers.add(paymentSuccessEventSubscriber);
	}
	
	public void unsubscribe(PaymentSuccessEventSubscriber subscriber) {
		subscribers.remove(subscriber);
    }
	
	public void paymentSuccess(String order_id) {
        for (PaymentSuccessEventSubscriber subscriber: subscribers) {
            subscriber.notify(order_id);
        }
    }

}
