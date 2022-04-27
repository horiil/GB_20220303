package string;

public class Main01 {

	public static void main(String[] args) {
		// 이메일 주소에서 아이디(student)와 도메인(java.com)을 구별하기
		
		// 이메일 주소 정의
		// split 사용 금지
		
		
//		방법 1. 문자열 자르기
		String email = "student@java.com";		// 주어지는 값은 사용자가 입력하는 값이기에 항상 변동 될 수 있다는 것을 기억하자
		String email_sub1 = email.substring(0, 6);
		String email_sub2 = email.substring(8);
		System.out.println(email_sub1);
		System.out.println(email_sub2);
		System.out.println("--------------------------------");

//		방법 2. 특정 문자 변경하기
		String email_new1 = email.replace("@", "\n");
		System.out.println(email_new1);
		
//		최적
		// "@"가 나타나는 위치 얻기
		int s = email.indexOf("@");
		
		// 처음부터 "@"가 나타나는 위치까지 자르기 -> 아이디
		String email_id = email.substring(0, s);
		
		// "@"가 나타나는 위치 다음부터 끝가지 자르기 -> 도메인
		String email_domain = email.substring(s + 1);
		
		System.out.println(email_id);
		System.out.println(email_domain);
	}

}
