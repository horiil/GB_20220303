package loop;

// while문과 do ~ while문의 차이
public class Main07 {

	public static void main(String[] args) {
		int max = 100;
		// while문은 조건문을  먼저 따지기 떄문에
		// 조건문에 (참일경우에만) 성립해야 출력이 가능한다.
		while( max > 100 ) {
			System.out.println("while문");
		}
		// do ~ while문은 실행 후 조건문을 따진다.
		// 그렇기에 조건문에 성립하지 않아도 무조건 한번은 실행된다.
		do {
			System.out.println("do ~ while문");
		}while( max > 100 );
	}
}
