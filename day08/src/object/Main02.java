package object;

class Member {
	String name;
	int age;

	// getName(). return, 전역변수 name
	public String getName() {
		return this.name;
	}

	// setName(), param name, 전역변수 name = param name
	public void setName(String name) {		//()안의 STring name이 아래의 main에서 값을 받아와서
		this.name = name;					// name이 또 그 값을 받아와서 this.name으로 넣어준다
	}

	// getAge(), return, 전역변수 age
	public int getAge() {
		return this.age;
	}

	// setAge(), param age, 전역변수 age = param age
	public void setAge(int age) {
		this.age = age;
	}

	// say(), getName(), getAge() 각각 출력
	public void say() {
		System.out.println(this.getName());
		System.out.println(getAge());
	}
}

public class Main02 {

	public static void main(String[] args) {
		// Member class 객체 생성
		Member your = new Member();

		// 메서드를 사용해서 전역변수 name, age에 임의의 데이터 할당
		your.setName("자바학생");
		your.setAge(5);

		// 객체.say() 메서드 호출
		// 출력 결과값: 임의의 데이터 할당한 뎅터 값 출력
		your.say();
		
		your.setName("DB학생");
		your.setAge(24);
		
		your.say();
		
	}

}
