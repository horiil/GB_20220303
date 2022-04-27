package method;

/*
 * 문제1, "Hello, World~" , "메서드가 호출되었습니다." 를
 * 출력하는 메서드를 각각 만들어 호출하세요
 */
public class Main05 {

	public static void main(String[] args) {
		HelloWorld();
		ShowMethod();
		a();
		b();
		System.out.println(reTurnM());
	}
	
	public static void HelloWorld() {
		String x = "Hello, World~";
		System.out.println(x);
	}
	
	public static void ShowMethod() {
		String y = "메서드가 호출되었습니다.";
		System.out.println(y);
		System.out.println("----------------------------------");
		
	}
	public static void a() {
		System.out.println("a");
	}
	public static void b() {
		System.out.println("b");
		System.out.println("----------------------------------");
	}
	
	public static String reTurnM() {
		return "문자열";
	}
}
