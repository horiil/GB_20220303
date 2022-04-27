package object;

class StudentJava{
	// 전역변수 2개 생성
	String name;
	int age;
	
	public StudentJava( String name, int age ) {
		// 생성자 파라미터의 값을 멤버변수에 복사
		this.name = name;
		this.age = age;
	}
	
}

public class Main04 {

	public static void main(String[] args) {
		// 생성자에 파라미터가 정의된 경우
		// 객체 생성 구문에서 해당 파라미터를 전달해야 한다.
		// 객체를 생성하면서 설정한 파라미터는 생성자를 통해 멤버변수에 저장된다.
		StudentJava stdJava = new StudentJava("JAVA학생", 28)	;	// StudentJava라는 생성자는 파라미터가 2개 있기때문에  똑같이 2개를 넣어줘야한다.
		
	}

}
