package inheritance;

public class Child extends Parent{
 
	public static void main(String[] args) {
        Child child = new Child();
		child.lastName();
		child.money();
		child.car();
		child.house();
		
		//Parent parent = new Parent();
		//parent.car();
	}
	
	@Override
	public int car() {
		int redCar=2;
		System.out.println("child car  "+redCar);
		return redCar;
		
	}
	
	public void house() {
		int house=1;
		System.out.println("child house"+ house);
	}
}
