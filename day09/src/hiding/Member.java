package hiding;

public class Member {
	private String name;
	private int age;
	
	/*
	 * parma name, age를 받아오는 생성자.
	 * 전역변수.name = name, 전역변수.age = age
	 */
	
	Member(String name, int age){
		this.name = name;
		this.age = age;
	}
	
	/*
	 * name,age 전역변수 getter, setter 생성
	 */
	
	public String getName() {
		return this.name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public int getAge() {
		return this.age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
}
