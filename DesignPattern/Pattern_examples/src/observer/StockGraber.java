package observer;
import java.util.ArrayList;

public class StockGraber implements Graber{
	private ArrayList<Observerable> observers;
	public double IBMprice, Googleprice, Appleprice;
	public void register(Observerable observer) {
		observers.add(observer);
	}

	public void unregister(Observerable observer) {
		observers.remove(observer);		
	}

	public void notifyprice() {
		for(int i=0;i<observers.size();i++)	{
			observers.get(i).update(IBMprice, Googleprice, Appleprice);
		}
	}

}
