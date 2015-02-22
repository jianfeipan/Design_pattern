package observer;

public interface Graber {
	public void register(Observerable observer);
	public void unregister(Observerable observer);
	public void notifyprice();
}
