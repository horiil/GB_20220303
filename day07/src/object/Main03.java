package object;

class HelloWorld {
	// 멤버변수(전역변수)는 모든 메서드가 공유한다.
	String message;

	void sayHello() {System.out.println(message);}
	void setEng() {message = "Hello Java";}
	void setKor() {message = "안녕하세요. 자바";}
}

public class Main03 {

	public static void main(String[] args) {
		HelloWorld hello = new HelloWorld();

		// 메서드 호출
		hello.sayHello();	// message 안에 값이 없기에 null이 출력됨
		hello.setEng();
		hello.sayHello();
		hello.setKor();
		hello.sayHello();

	}

}
