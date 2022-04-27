package Interface;

public class Character implements Action, Fight, Move {
	private String name;

	/*
	 * 다음과 같이 메서드 재정의가 이루어지면 필요한 기능을 구현한다.
	 */
	public Character(String name) {
		super();
		this.name = name;
	}
//	getter, setter 를 사용하지 않은 이유는 : name 값을 변경하지 않을 것이기에 this.name으로 만들었다
	
	
	@Override
	public void walk() {
		System.out.println(this.name + " >> 걷는다");
	}

	@Override
	public void run() {
		System.out.println(this.name + " >> 뛴다");
	}

	@Override
	public void jump() {
		System.out.println(this.name + " >> 점프!");
	}

	@Override
	public void attack() {
		System.out.println(this.name + " >> Attack!!");
	}

	@Override
	public void shield() {
		System.out.println(this.name + " >> shield!");
	}

	@Override
	public void pickup() {
		System.out.println(this.name + " >> 아이템을 줍는다.");
	}
}
