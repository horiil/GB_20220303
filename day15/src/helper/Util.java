package helper;

/*
 * 문제,
 - helper 패키지 안에, Util 이라는 class 생성
- 싱글톤으로 random(min, max) 메서드를 추가

- main() class 생성
- 5자리 인증번호를 생성해서 출
 */// 내가 푼거 오답;;
 

public class Util {
	private static Util current;

	public static Util getInstance() {
		if (current == null) {
			current = new Util();
		}
		return current;
	}

	public static void freeInstance() {
		current = null;
	}

	private Util() {
		super();
	}

	public void random(String min, String max) {

		int random = (int) (Math.random() * (99999 - 10000 + 1) + 10000);
		System.out.println(random);
	}

}