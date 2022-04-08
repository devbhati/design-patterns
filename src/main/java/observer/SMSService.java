package observer;

public class SMSService implements PaymentSuccessEventSubscriber {
	
	public void sendSMS(String order_id) {
		System.out.println("Sending sms to"+order_id);
	}

	public void notify(String order_id) {
		sendSMS(order_id);
	}

}
