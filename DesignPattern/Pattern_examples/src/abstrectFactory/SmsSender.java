package abstrectFactory;

public class SmsSender implements Senderable{
	public void send(String msg) {
		System.out.println("sent by sms : " + msg);
		
	}
}
