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
		// this�� �� Ŭ������ ����Ŵ.
		this.brand = brand;
		this.color = color;
		this.price = price;
	}
	void engineStart() {
		System.out.println("�õ� �ѱ�");
	}
	void engineStop() {
		System.out.println("�õ� ����");		
	}
};