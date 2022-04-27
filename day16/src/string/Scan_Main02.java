package string;

import java.util.Scanner;

public class Scan_Main02 {

	public static void main(String[] args) {
		/*
		 * 주민등록번호에서 생년월일을 추출하기 - 800501 1234567 - > 1980년 05월 01일 남자 - 뒷부분 첫 글자 : 1, 2 :
		 * 19~ / 3, 4 : 20~ : 1, 3 : 남성 / 2, 4 : 여성 980326 1085319
		 */
		Scanner sc = new Scanner(System.in);
		String user = sc.next();

//		앞 6자리를 년, 월, 일 단위로 나누기
		String yy = user.substring(0, 2);
		String mm = user.substring(2, 4);
		String dd = user.substring(4, 6);

		String gender_c = user.substring(6, 7);
		if (gender_c.equals("1") || gender_c.equals("2")) {
			yy = "19" + yy;
		} else {
			yy = "20" + yy;
		}
		
		if (gender_c.equals("2") || gender_c.equals("4")) {
			gender_c = "여자";
		} else {
			gender_c = "남자";
		}
		String result = String.format("%s %s %s %s", yy, mm, dd, gender_c);
		System.out.println(result);

		sc.close();
	}

}
