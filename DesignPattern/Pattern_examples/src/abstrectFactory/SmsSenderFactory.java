package abstrectFactory;

public class SmsSenderFactory implements SenderProvider{

	public Senderable provideSender() {
		return new SmsSender();
	}

}
