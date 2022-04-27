package hiding;

public class Main02 {

	public static void main(String[] args) {
	
		// Member 클래스 객체생성
		Member who = new Member("토토로", 915);
		
		
		// name, age 각각 출력
		System.out.println("이름 : " + who.getName());
		System.out.println("나이 : " + who.getAge());
		
	}

}
