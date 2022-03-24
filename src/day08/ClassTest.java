package day08;

public class ClassTest {
	public static void main(String[] args) {
		Car mycar = new Car("ferrari", "black", 50000);
		Car momcar = new Car("k8", "white", 4000);
		
//		Car mycar = new Car();
//		mycar.brand = "Ferrari";
//		mycar.color = "Red";
//		mycar.price = 65000;
//		
//		Car momcar = new Car();
//		momcar.brand = "K8";
//		momcar.color = "black";
//		momcar.price = 4000;
		
		System.out.println(mycar.brand);
		System.out.println(momcar.brand);
		momcar.engineStart();
		
	}
}

class Car{
	String brand;
	String color;
	int price;		
	
	Car(String brand, String color, int price) {
		// this는 이 클래스를 가르킴.
		this.brand = brand;
		this.color = color;
		this.price = price;
	}
	void engineStart() {
		System.out.println("시동 켜기");
	}
	void engineStop() {
		System.out.println("시동 끄기");		
	}
};