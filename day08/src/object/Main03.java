package object;

// 클래스명과 생성자 명의 이름이 같아야한다.
class Book{
	String subject;
	String content;
	
	/*
	 * 생성자 -> 객체가 생성될 때, 자동으로 실행되는 특수한 메서드
	 * 특징 -> 리턴형을 명시하지 않는다. 클래스와 이름이 동일하다.
	 */
	
	Book(){
		System.out.println("생성자 호출");
		this.subject = "JAVA 입문";	// this가 붙으면 전역변수
		this.content = "JAVA란 무엇인가?";
	}
	
	void read() {		// void가 붙으면 return값이 없다.
		System.out.println("read() 메서드 실행");
		System.out.println(this.subject);
		System.out.println(this.content);
	}
	
}

public class Main03 {

	public static void main(String[] args) {
		// Book 클래스의 생성장에서 멤버변수에 대한 기본값을 설정하기 때문에,
		// 객체를 생성하는 것 만으로 멤버변수가 초기화 된다.
		Book book = new Book();			// 객체 생성한 후에 바로 객체 호출
		book.read();
		
	}

}
