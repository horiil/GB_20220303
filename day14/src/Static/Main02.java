package Static;

public class Main02 {

	public static void main(String[] args) {
		/*
		 * 객체를 여러 개 생성하더라도, 클래스 내부에서
		 * static으로 선언된 하나의 객체만 참조하기 때문에,
		 * 메모리의 사용을 절약할 수 있다.
		 */
//	결과적으로 Calc는 하나만 존재하고, 이름만 다른 여러개의 객체를 생성해서  그 기능을 사용할 수 있다.
		
		
		// 싱글톤 객체 사용하는 방법
		
		/*
		 * - getInstance() 메서드를 사용하여 객체를 리턴 받는 형식으로 사용한다.
		 * - 여러 개의 객체를 리턴 받더라도 모두 하나의 static 객체를 참조하게 되기 때문에
		 * 전역 객체 하나만이 메모리에할당되게 된다. 
		 */
		
//		Calc 클래스의 객체인 loader1을 생성해서
		Calc loader1 = Calc.getInstance();
//		loader1을 사용해서 Calc의 기능인 plus 기능을 사용함
		loader1.plus(10, 20);
		
//	이렇게도 사용가능  // 참조처리를 생략하고 직접 사용한 경우이다.
		Calc.getInstance().minus(10, 20);

// 같은 Calc의 기능을 다른 이름(loader1, loader2으로 담아서 사용해본 것.
		Calc loder2 = Calc.getInstance();
		loder2.minus(10, 30);

	}
}
