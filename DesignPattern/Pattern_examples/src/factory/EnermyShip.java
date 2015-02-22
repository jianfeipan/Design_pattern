package factory;

public abstract class EnermyShip {
	private String name;
	private double lifeValue;
	private double damage;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getLifeValue() {
		return lifeValue;
	}
	public void setLifeValue(double lifeValue) {
		this.lifeValue = lifeValue;
	}
	public double getDamage() {
		return damage;
	}
	public void setDamage(double damage) {
		this.damage = damage;
	}
}
