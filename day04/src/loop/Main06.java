package loop;

public class Main06 {

	public static void main(String[] args) {
		// 구구단 7단, d0 ~ while문으로 출력

		int i = 1;
		int nana = 0;

		do {
			nana += i;
			nana = 7 * i;
			i++;
			System.out.println(nana);
		} while (i < 10);

	}

}
