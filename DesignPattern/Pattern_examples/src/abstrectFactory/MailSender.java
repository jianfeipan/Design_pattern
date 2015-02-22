package abstrectFactory;

public class MailSender implements Senderable{

	public void send(String msg) {
		System.out.println("sent by mail : " + msg);
		
	}

}
