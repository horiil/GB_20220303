package wrapper;

public class Main01 {

	public static void main(String[] args) {
		String a = "20";
		String b = "3.14";

		System.out.println(a + b);
		System.out.println("----------------------------------------");

		// wrapper 클래스의 가장 중요한 기능은 특정 데이터형의 모ㅑㅇ을
		// 하고있는 문자열을 실제 데이터형으로 변환하는 기능이다.
		int num_a = Integer.parseInt(a);
		float num_b = Float.parseFloat(b);

		// 변환된 값은 사칙연산이 가능하다.
		int v1 = num_a + 500;
		float v2 = num_b + 500;

		System.out.println("v1 = " + v1);
		System.out.println("v2 = " + v2);

		// 기본 데이터 형의 객체화
		// 객체화 시키려고 int i가 아닌 Integer i라고 작성했다.
		// 하지만 이런식으로는 잘 사용하지 않는다.
		Integer i = new Integer(500);
		
		// 기본 데이터 형과 객체화 된 데이터는 서로 연산이 가능하다.
		int j = i + 300;
		System.out.println("j = " + j);
	}
}
