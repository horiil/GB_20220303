package method;

/*
 * 문제3, 반환 값이 있고 받는 인자값이 없는 메서드를 구현하세요
 */
public class Main07 {

	public static void main(String[] args) {
		int c = f1(6);
		boolean rMethod = returnMethod();
		System.out.println(c);
		System.out.println(rMethod);
	}

	public static int f1 (int a) {
		int b = a + 4;
		return b;
	}
	
	public static boolean returnMethod() {
		return false;
	}
	
}


