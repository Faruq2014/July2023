package inheritance;

public class Parent {

	public int car;
	private double money;
	private String lastName;
	
	public void lastName() {
		lastName = "Molla";
		System.out.println("parent last name "+lastName);
	}


	protected int car() {
		car = 1;
		System.out.println("parent car "+car);
		return car;

	}

	public double money() {
		 money = 20000;
		System.out.println("parent money "+money);
		return money;
	}


}
