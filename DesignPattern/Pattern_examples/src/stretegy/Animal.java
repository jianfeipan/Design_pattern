package stretegy;

public abstract class Animal{
	private String name;
	public Flyable flytype;
	
	public Animal(String name) {
		this.setName(name);
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
}
