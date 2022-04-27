package loop;


public class Main10 {

	public static void main(String[] args) {

		// for문
		// 문제1. 1 ~ 50까지 숫자의 합

		int a = 0;
		for (int i = 1; i < 51; i++) {
			a += i;
		}
		System.out.println(a);
		System.out.println("----------------------------------------------------");

		// 문제2. 구구단 2단
		// 2 * 1 = 2
		// 2 * 2 = 4
		// 2 * 3 = 6
		// 2 * 4 = 8
		// 2 * 5 = 10
		// 2 * 6 = 12
		// 2 * 7 = 14
		// 2 * 8 = 16
		// 2 * 9 = 18

		int two;
		for (int i = 1; i < 10; i++) {
			two = i * 2;
			System.out.println("2 * " + i + " = " + two);
		}
		System.out.println("----------------------------------------------------");

		// while문
		// 문제1. 10번찍어 안 넘어가는 나무 없다.
		// 나무를 1번 찍었습니다.
		// 나무를 2번 찍었습니다.
		// ...
		// 나무를 10번 찍었습니다.

		int Hit = 1;
		while (Hit <= 10) {
			System.out.println("나무를 " + Hit + "번 찍었습니다.");
			Hit++;
			// } System.out.println("나무 넘어갑니다.");
			if (Hit == 10) {
			}
			System.out.println("나무 넘어갑니다.");
		}

	}

}
