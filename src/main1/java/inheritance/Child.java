package inheritance;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Child extends Parent{
 
	public static void main(String[] args) {
        Child child = new Child();
		child.lastName();
		child.money();
		child.car();
		child.house();
		ChromeDriver driver1= new ChromeDriver();
		
		Parent parent = new Parent();
		parent.car();
		parent.money();
		parent.lastName();
		//parent.house(); // parent can not have child method
		//WebDriver driver3 = new WebDriver();//WebDriver is an interface, 
		// interface can create object/constructor
		
		
		Parent child1= new Child();//dynamic pollymorphism 
		child1.car();
		WebDriver driver = new ChromeDriver();//
	}
	
	@Override
	public int car() {
		int redCar=2;
		System.out.println("child car  "+redCar);
		return redCar;
		
	}
	
	public void house() {
		int house=1;
		System.out.println("child house "+ house);
	}
}
