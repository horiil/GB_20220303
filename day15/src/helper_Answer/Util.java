package helper_Answer;

/*
 * 문제,
 - helper 패키지 안에, Util 이라는 class 생성
- 싱글톤으로 random(min, max) 메서드를 추가

- main() class 생성
- 5자리 인증번호를 생성해서 출
 */// 정답
public class Util {
	// ---------------- 싱글톤 객체 생성 시작 ----------------
	private static Util current;
	
	public static Util getInstance() {
		if ( current == null ) {
			current = new Util();
		}
	return current;
	}
	
	public static void freeInstance() {
		current = null;
	}
	
	private Util() {
		current = null;
	}
	// ---------------- 싱글톤 객체 생성 끝 ----------------
	
	/*
	 * 범위를 갖는 랜덤값을 생성하여 리턴하는 메서드
	 * @param min - 범위안에서의 최소값
	 * @param max - 범위 안에서의 최대값
	 * @return min ~ max 안에서의 랜덤값
	 */
	public int random(int min, int max) {
		int num = (int) ((Math.random() * (max - min + 1)) + min);
		return num;
	}
}
