package boxing;

public class Navy extends Unit {
	public Navy(String name) {
		super(name);
	}
	
	@Override
	public void attack() {
		super.attack();
		System.out.println(this.getName() + " >> 해상공격 실행");
		System.out.println(this.getName() + " >> 어뢰 발사!");

	}
	
	public void nucleus() {
		System.out.println(super.getName() + ">> 핵미사일");
	}
}
