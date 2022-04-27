package Interface;

public class Monster implements Fight, Move {
	private String name;

	/*
	 * 다음과 같이 메서드 재정의가 이루어지면 필요한 기능을 구현한다.
	 */
	
	public Monster(String name) {
		super();
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

//  값을 고정시킬 것이기에 getter, setter를 사용하지 않아도 됬지만, 사용해 보았다.
	
	@Override
	public void walk() {
		System.out.println(this.getName() + " >> 느릿느릿하게 걷는다.");
	}

	@Override
	public void run() {
		System.out.println(this.getName() + " >> 느리게 뛴다");
	}

	@Override
	public void jump() {
		System.out.println(this.getName() + " >> 짧은 점프!");
	}

	@Override
	public void attack() {
		System.out.println(this.getName() + " >> Attack!!");
	}

	@Override
	public void shield() {
		System.out.println(this.getName() + " >> shield!");
	}

}
