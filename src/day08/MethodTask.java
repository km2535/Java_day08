package day08;

public class MethodTask {
	public static void main(String[] args) {
		MethodTask m = new MethodTask();
		System.out.println(m.makeUpper2("ddJJJ"));
		System.out.println(m.reverse("Helo"));
		System.out.println(m.isdigit("Helo"));
		System.out.println(m.isdigit("423432"));
		System.out.println(m.changeCase("HdeHF"));
	}

	String makeUpper2(String str) {
//		len�̶�� ������ ���ڿ��� ���̸� �־� ���뼺�� ������.
		int len = str.length();
		String result = "";
		for (int i = 0; i < len; i++) {
//			�ڵ��� �������� ���� ��� �ۼ��ǰ� �ݺ��Ǵ� �ڵ�� ������ �Ҵ���.
			char ch = str.charAt(i);
//			���� Ǯ�̶� �ٸ� ����  �ƽ�Ű�ڵ� 10������ �Ⱦ��� �Ʒ�ó�� �ٷ� ���ڵ� ����ó�� ����� ����.
			if(ch >= 'a' && ch <= 'z') {
//				���ΰ� ����
				result += (char)(ch-32);
			}
			else {
//				������ �ٸ�
				result += ch;
			}
		}
		return result;
	}
	
	String reverse(String str) {
//		�� ������ �����ϰ� len�̶�� ������ �������.
		int len = str.length();
		String result = "";
//		ù��° ���
//		for (int i = 0; i < len; i++) {
//		���ڸ� ��� ������ ����� ���ڿ����� �Ҵ��Ѵ�.
//			char ch = str.charAt(i);
//		���ڸ� �׷���  result�� ������ ���̸� �Ųٷ� ���������!
//			result = ch + result;
//		}
//		�ι�° ���
//		�迭 ��ü�� �Ųٷ� ������.
		for (int i = str.length()-1; i >= 0; i--) {
//			���ڸ� ch������ �̾Ƴ���
			char ch = str.charAt(i);
//			result�� ���δ�.
			result += ch;
		}
		return result;
	}
	
	boolean isdigit(String str) {
//		len�� ����� ���뼺�� ���δ�
		int len = str.length();
		for (int i = 0; i < len; i++) {
//			ch�� ���ڸ� �ϳ��� �̾Ƽ�
			char ch = str.charAt(i);
//			���ڰ� �ƴѰ� �ϳ��� �ִٸ� �Ʒ��� �� false�� return�Ѵ�.
			if(ch<'0' || ch>'9') {
				return false;
			}
		}
//		�� ���ǽĿ� ���� �ʾҴٸ� true�� return �ϸ� �ȴ�.
		return true;
	}
	String changeCase(String str) {
		int len = str.length();
		String result = "";
		for (int i = 0; i < len; i++) {
			char ch = str.charAt(i);
			if(ch >= 'a' && ch <= 'z') {
				result += (char)(ch-32);
			}else if(ch >= 'A' && ch<= 'Z') {				
				result += (char)(ch+32);
			}
			else {
				result += ch;
			}
		}
		return result;
	}
	String changeToHangle(int num) {
//		���ڿ��� �������. ���ڿ��� �ϳ��� �̾Ƽ� ����� �����ϱ� ����
		String hangle = "�����̻�����ĥ�ȱ�";
//		���� ���ڸ� ���ڿ��� �ٲپ� �ϳ��� �̾� ����� �� �ְ� �Ͽ���.
		String data = num + "";
//		len
		int len = data.length();
//		����� ���� ����
		String result = "";
		for (int i = 0; i < len; i++) {
//			ch��� ������ ���ڸ� �ϳ��� �̴´�.
			char ch = data.charAt(i);
//			ch��� ������ ����ִ� 0���� �����ϴ� ���ڴ� �ƽ�Ű �ڵ��� ������ 48���� ����ִ�.
//			idx�� ����� 48�� ���ָ� 0~9���� ���������. �̸� ��ٷ� �ε����� Ȱ���Ѵ�.
			int idx = ch-48;
			result += hangle.charAt(idx);
		}
		return result;	
	}
	
	
	
}
