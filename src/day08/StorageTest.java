package day08;

public class StorageTest {
//	���������� �ٸ� ������ ����� �� �ִ�. �׷��� ���� �޼ҵ忡�� ��� �Ұ��ϴ�.
	int data2 = 20;
//	���� ������ �������� ���� �������� �����ϱ⸸ �ϸ� �Ʒ�ó�� ���� �޼ҵ忡�� ��� �����ϴ�.
	static int data3 = 30;
	public static void main(String[] args) {
//		���������� ���θ޼ҵ忡�� ��밡���ϴ�.
		System.out.println(data3);
		//static �޼ҵ� ���ο����� �Ϲ� ���������� ����� �� ����.
		//System.out.println(data2);
	}
	void f1() {
//		���� ����� ������ ���� �����̴�. ���� ������ ���� �ܿ��� ��� �� �� ����.
		int data1 = 10;
		System.out.println(data2);
	}
	void f2() {
//		data1�� ����� �� ����.
		//System.out.println(data1);
		System.out.println(data2);
	}
}
