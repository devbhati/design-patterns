package observer;

public class EmailService implements PaymentSuccessEventSubscriber {
	
	public void sendEmail(String order_id) {
		System.out.println("Sending email to"+order_id);
	}

	public void notify(String order_id) {
		sendEmail(order_id);
	}

}
