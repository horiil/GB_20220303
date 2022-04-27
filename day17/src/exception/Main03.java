// Main 01 참고
package exception;

public class Main03 {

	public static void main(String[] args) {
		
		try {
		String year2 = "뭘까";
		int age2 = 2022 - Integer.parseInt( year2 ) + 1;
		System.out.println(age2);
		
		} catch( NumberFormatException e ) {
			System.out.println("에러가 발생했습니다.");
			System.out.println("에러의 원인  : " + e.getMessage() );
			 
			e.printStackTrace();
		}
		
		System.out.println("-------- 프로그램 종료 -------");
		
				
				
		
	}

}
// Exception 예외상황을 가리키는 에러문구