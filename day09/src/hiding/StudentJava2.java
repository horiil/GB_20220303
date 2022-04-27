package hiding;

public class StudentJava2 {
	// 은닉된 멤버변수 -> 현재 블록 안에서만 접근 가능함
	private String name;
	private int age;

	// getter 메서드 2개
	// 은닉된 멤버변수의 값을 읽는 방법
	String getName() {
		return this.name;
	}

	int getAge() {
		return this.age;
	}

	// setter 메서드 2개
	// 은닉된 멤버변수에 값을 넣는 방법
	void setName(String name) {
		this.name = name;
	}

	void setAge(int age) {
		this.age = age;
	}

	void printer() {
		System.out.println(this.name);
		System.out.println(this.age);
	}
}
