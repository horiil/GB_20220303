package object;

class Calc {
	// plus, param int x, int y, return
	int plus(int x, int y) {
		return x + y;
	}

	// minus, param int x, int y return
	int minus(int x, int y) {
		return x - y;
	}

	// times, param int x, int y, return
	int times(int x, int y) {
		return x * y;
	}

	// divide, param int x, int y, return
	int divide(int x, int y) {
		// 0으로 나누면 에러가 생기기때문에 아래의 코드를 추가한다.
		// y가 0이 아닐때는 아래의 if문을 실행
		// y가 0일때는 0인 result를 출력
		int result = 0;
		if (y != 0) {
			return x / y;
		}

		return result;
	}

}

public class Main04 {

	public static void main(String[] args) {
		// 객체생성
		Calc c = new Calc();
		
		// plus
		int p = c.plus(100, 50);
		System.out.println("100 + 50 = " + p);
		// minus
		int m = c.plus(29, 3);
		System.out.println("29 - 3 = " + m);
		// times
		int t = c.plus(30, 24);
		System.out.println("30 * 24 = " + t);
		// divide
		int d = c.plus(30, 40);
		System.out.println("30 / 24 = " + d);
		
	}

}
