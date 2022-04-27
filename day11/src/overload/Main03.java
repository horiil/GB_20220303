package overload;

//main()가 포함된 클래스 생성, 객체 생성을 생성자 타입별로 생성 후, 출력 toString메서드로
public class Main03 {
	
	public static void main(String[] args) {
	// 생성자가 여러가지 형태로 Overload 되어 있기 떄문에
	// 객체를 생성하는 방법이 다양해졌다.
		
		Member m1 = new Member();
		System.out.println( m1.toString() );

		Member m2 = new Member(25);
		System.out.println( m2.toString() );
		
		Member m3 = new Member("학생");
		System.out.println( m3.toString() );
		
		Member m4 = new Member("강사", 30);
		System.out.println( m4.toString() );
		
	}

}
