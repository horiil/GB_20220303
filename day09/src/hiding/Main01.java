package hiding;

public class Main01 {

	public static void main(String[] args) {
		// 객체생성
		StudentJava2 hid = new StudentJava2();

		// setter 임의의 데이터 세팅, name, age 모두
		hid.setName("자바학생2");
		hid.setAge(10);

		// getter 출력, name, age 모두
		hid.printer();
	}

}
