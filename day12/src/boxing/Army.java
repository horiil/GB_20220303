package boxing;

public class Army extends Unit{
	
	// 부모 클래스의 생성자를 강제 호출하기 위한 생성자
	public Army(String name) {
		super(name);
	}
	
	// 공격의 형태를 육군에 맞춰서 변경시키려면
	// 부모 클래스가 가지고 있는 공격 준비 기능을
	// super 키워드를 통해 보전
	@Override
	public void attack() {
		super.attack();
		System.out.println(super.getName() + " >> 지상공격 실행");
		System.out.println(super.getName() + " >> 돌격!!");
	}
	
	public void tank() {
		System.out.println(super.getName() + " >> 탱크 공격");
	}
}
