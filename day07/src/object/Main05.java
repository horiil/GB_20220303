package object;
// this는 전역변수와 지역변수의 변수명이 같을때 전역변수와 지역변수를 구분하기 위해서 사용한다.
class User{
	String subject; // 전역변수\
	int age;
	String hobby;	// 전연변수 hobby와 지역변수 hobby에는 다른 값이 담긴다
											// hobby는 맨 아래의 u1.setName안의 독서라는 파라미터를 가져온다
	public void setName (String name, String hobby) {	// 지역변수 hobby
		System.out.println(name);	// 자바학생의 출력코드
		// this를 붙이는건 전역변수를 의밓나다.
		this.subject = "국비지원";
		this.age = 25;
		this.hobby = hobby;
	// 지역변수 hobby안의 파라미터값인 독서를,  전역변수 hobby안에 담는다.
	// 아래의 main문에서 가져온 파라미터 값은 지역변수를 사용하면 바로 출력된다.
		System.out.println("과목 : " + this.subject + " , 나이 : " + age + ", 취미 : " + hobby);
	}
}

public class Main05 {

	public static void main(String[] args) {
		User u1 = new User();
		u1.setName("자바학생", "독서");
		
		
	}

}
