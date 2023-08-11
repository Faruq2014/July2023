package inheritance;

public class GrantChild extends Parent {
	
	
	public GrantChild() {
		
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		GrantChild ch= new GrantChild();
		ch.money();
		
		
		
	}

	public void computer() {
		System.out.println("I am grand child with new computer");
	}
}
