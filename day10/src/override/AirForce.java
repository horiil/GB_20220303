package override;

public class AirForce extends Unit {
	public AirForce(String name) {
		super(name);
	}
	
	@Override
	public void attack() {
		super.attack();
		// 부모것을 상속받았기에 super와 this 둘다 상관없다
		System.out.println(this.getName() + " >> 전투기 이륙");
		System.out.println(this.getName() + " >> 미사일 발사!");
	}
	
	public void bombing() {
		System.out.println(this.getName() + " >> 폭격");
	}
}