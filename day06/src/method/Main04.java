package method;

public class Main04 {

	public static void main(String[] args) {
		System.out.println( f2(100));
	}
	
	public static int f1( int x ) {		// void가 없다는 것은 return값이 있다는것. 그 값은 int 타입의 f1이다.
		return x + 1;
		
	}
	
	public static int f2 ( int x ) {
		// 다른 메서드의 호출
		return f1(x) + 1;
	}

}
