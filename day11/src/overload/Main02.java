package overload;

	// class Hello 생성
class Hello {
	// Hello 클래스의 기본생성자
	Hello(){
		System.out.println("Hello");
	}
	// Overload한 데이터 타입이 다른 Hello 
	Hello (String msg){
		System.out.println( msg );
		
	}
}


public class Main02 {

	public static void main(String[] args) {
	//  Hello의 객체인 h1  생성
	//  Hello의 객체생성 만으로도 Hello의 기본생성자를 가져올 수 있ㄷ.
		Hello h1 = new Hello();
	//  Overload한 Hello의 객체	
		Hello h2 = new Hello("월요일 입니다.");
	}

}
