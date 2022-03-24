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
//		len이라는 변수에 문자열의 길이를 넣어 재사용성을 강조함.
		int len = str.length();
		String result = "";
		for (int i = 0; i < len; i++) {
//			코드의 가독성을 위해 길게 작성되고 반복되는 코드는 변수로 할당함.
			char ch = str.charAt(i);
//			나의 풀이랑 다른 점은  아스키코드 10진수를 안쓰고 아래처럼 바로 문자도 숫자처럼 사용이 가능.
			if(ch >= 'a' && ch <= 'z') {
//				본인과 같음
				result += (char)(ch-32);
			}
			else {
//				변수만 다름
				result += ch;
			}
		}
		return result;
	}
	
	String reverse(String str) {
//		위 문제와 동일하게 len이라는 변수를 만들었다.
		int len = str.length();
		String result = "";
//		첫번째 방법
//		for (int i = 0; i < len; i++) {
//		문자를 담는 변수를 만들고 문자열들을 할당한다.
//			char ch = str.charAt(i);
//		문자를 그래도  result를 후위에 붙이면 거꾸로 만들어진다!
//			result = ch + result;
//		}
//		두번째 방법
//		배열 자체를 거꾸로 돌린다.
		for (int i = str.length()-1; i >= 0; i--) {
//			문자를 ch변수에 뽑아내서
			char ch = str.charAt(i);
//			result에 붙인다.
			result += ch;
		}
		return result;
	}
	
	boolean isdigit(String str) {
//		len을 만들어 재사용성을 높인다
		int len = str.length();
		for (int i = 0; i < len; i++) {
//			ch로 문자를 하나씩 뽑아서
			char ch = str.charAt(i);
//			숫자가 아닌게 하나라도 있다면 아래로 들어가 false로 return한다.
			if(ch<'0' || ch>'9') {
				return false;
			}
		}
//		위 조건식에 들어가지 않았다면 true를 return 하면 된다.
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
//		문자열로 만들었다. 문자열도 하나씩 뽑아서 사용이 가능하기 때문
		String hangle = "공일이삼사오육칠팔구";
//		받은 숫자를 문자열로 바꾸어 하나씩 뽑아 사용할 수 있게 하였다.
		String data = num + "";
//		len
		int len = data.length();
//		결과를 담을 변수
		String result = "";
		for (int i = 0; i < len; i++) {
//			ch라는 변수로 문자를 하나씩 뽑는다.
			char ch = data.charAt(i);
//			ch라는 변수에 들어있는 0부터 시작하는 숫자는 아스키 코드의 숫자인 48부터 들어있다.
//			idx를 만들어 48을 빼주면 0~9까지 만들어진다. 이를 곧바로 인덱스로 활용한다.
			int idx = ch-48;
			result += hangle.charAt(idx);
		}
		return result;	
	}
	
	
	
}
