package method;

/*
 * 반환값이 있고, 받는 인자값(매개변수, 파라미터)이 있는 메서드를 구현해보세요.
 */
public class Main08 {

	public static void main(String[] args) {
		System.out.println( a1(3, 30));
		System.out.println( a1(10, 10));
		System.out.println( a1(30, 2));
		System.out.println( a1(20, 0));
	}
	
	public static float a1(int x, int y) {		// x, y가 인자값
		return x + y;
		
	}
	

}
