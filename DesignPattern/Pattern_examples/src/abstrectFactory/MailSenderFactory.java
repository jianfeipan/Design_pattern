package abstrectFactory;

public class MailSenderFactory implements SenderProvider{

	public Senderable provideSender() {
		// TODO Auto-generated method stub
		return new MailSender();
	}

}
