package object;


// 생성자 객체에 값을 초기화 시키고 새로 넣고싶을때 사용 	/메서드 어떠한 기능을 구현시키고 싶을 때 사용
// 저는 생성자를 정의해줄 때는, 객체를 생성할 때 객체 생성과 동시에 특정 과정을 수행하도록 하는 것 이기도 하다

class Aricle{
	int seq;			// 글 번호
	String subject;		// 글 제목
	String writer;		// 작성자
	
	/* 
	 * 파라미터가 존재하는 생성자
	 * 모든 전역변수를 초기화 = 전역변수에 값을 할당하는 것
	 */
	
	Aricle(int seq, String subject, String writer) {
		this.seq = seq;
		this.subject = subject;
		this.writer = writer;
	}

	/*
	 * 메서드, 전역변수 각각을 출력하는 메서드 작성
	 */
	
	void printer() {
		System.out.println(this.seq);
		System.out.println(this.subject);
		System.out.println(this.writer);
	}
}

public class Main05 {

	public static void main(String[] args) {
		// Article 객체 1번 생성
		Aricle aricle1 = new Aricle(21, "자바의 정석", "NGS");
		// 객체.메서드(); (출력 메서드 호출)
		aricle1.printer();

		System.out.println("---------------------------");
		// Article 객체 2번 생성
		Aricle aricle2 = new Aricle(31, "객체지향의 사실과 오해", "CYG");
		// 객체.메서드(); (출력 메서드 호출)
		aricle2.printer();
	}

}
