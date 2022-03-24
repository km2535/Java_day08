package day08;

public class StorageTest {
//	전역변수는 다른 곳에서 사용할 수 있다. 그러나 메인 메소드에서 사용 불가하다.
	int data2 = 20;
//	정적 변수는 전역변수 선언 공간에서 선언하기만 하면 아래처럼 메인 메소드에서 사용 가능하다.
	static int data3 = 30;
	public static void main(String[] args) {
//		정적변수는 메인메소드에서 사용가능하다.
		System.out.println(data3);
		//static 메소드 내부에서는 일반 전역변수를 사용할 수 없다.
		//System.out.println(data2);
	}
	void f1() {
//		여기 선언된 변수는 지역 변수이다. 지역 변수는 여기 외에서 사용 할 수 없다.
		int data1 = 10;
		System.out.println(data2);
	}
	void f2() {
//		data1은 사용할 수 없다.
		//System.out.println(data1);
		System.out.println(data2);
	}
}
