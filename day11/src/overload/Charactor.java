package overload;

public class Charactor {
	private String job;
	private int age;
	
	public void setProperty ( String job ) {
		this.job = job;
	}
	
	public void setProperty ( int age ) {
		this.age = age;
	}
	
	public void setProperty( String job, int age ) {
		this.job = job;
		this.age = age;
	}
	
	public void setProperty( int age, String job ) {
		this.age = age;
		this.job = job;
	}
	
	// 전역변수 job과 age를 출력하는 String return 타입의 메서드
	
	// age 는 String으로 자동으로 형 변환이 된다.
	public String toString() {
		return" Charactor [ Job = " + job + ", age = " + age + "]";
				
	}
}
