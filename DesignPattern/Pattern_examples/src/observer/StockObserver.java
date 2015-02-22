package observer;

public class StockObserver extends Thread implements Observerable{

	public void update(double IBMprice, double Googleprice, double Appleprice) {
		System.out.println("IBMprice"+ IBMprice);
		System.out.println("Googleprice"+ Googleprice);
		System.out.println("Appleprice"+ Appleprice);
	}
}
