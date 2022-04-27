package string;

public class Main05 {

	public static void main(String[] args) {

		/*
		 * D:/photo/2022/travel/food.jpg 라는 파일이 있습니다.
		 * 이 파일의 경로를 data라고하는 객체로 생성한 뒤에, 다음의 형태로 출력
		 * (split() 메서드 사용 금지)
		 * -------------------------------------------
		 * 파일이름	: food
		 * 확장자		: jpg
		 * 폴더명		: D:/photo/2022/travel 
		 */
	
		String data = "D: /photo/2022/travel/food.jpg";
		
		String File_name = data.substring(22, 26);
		String File_ex = data.substring(27, 30);
		String File_path = data.substring(0, 21);
		
		System.out.println("파일이름" + "\t : " + File_name);
		System.out.println("확장자" + "\t : " + File_ex);
		System.out.println("홀더명" + "\t : " + File_path);
	
		
/*		강사님이 한 방법
		String data = "D: /photo/2022/travel/food.jpg";
		
		// 파일이름 추천
		String name = data.substring( data.lastIndexOf("/") + 1,
										data.lastIndexOf("."));
		System.out.println("파일이름 = " + name);
		
		// 확장자 추출
		String ext = data.substring( data.lastIndexOf(".") + 1 );
		System.out.println("확장자= " + ext);
		
		// 소스파일 폴더이름 추출
		System.out.println("폴더명= " + data.substring(0, data.lastIndexOf("/")) );
*/	
	}

}
