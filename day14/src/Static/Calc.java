package Static;

// SingleTon
public class Calc {
	// ---------------- 싱글톤 객체 생성을 위한 준비 시작 -----------------
	private static Calc current;
	
	public static Calc getInstance() {
		if ( current == null ) {	// current에 값이 없다면
			current = new Calc();	// 값을 새로 받을 것
		}					
			
		return current;				// 값이 있다면 return 받을 것.
	}
	// 객체를 삭제 하는 메서드
	public static void freeInstance() {
		current = null;
	}
	
	private Calc() {
		super();
	}
	// ---------------- 싱글톤 객체 생성을 위한 준비 끝 -----------------

	// 이 클래스가 구현해야 하는 기능
	public void plus( int x, int y ) {
		int z = x + y;
		System.out.println(x + " + " + y + " = " + z);
	}
	
	public void minus( int x, int y) {
		int z = x - y;
		System.out.println(x + " - " + y + " = " + z);
	}
}
