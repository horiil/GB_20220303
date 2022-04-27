package extendsclass;

public class Main02 {

	public static void main(String[] args) {
		QNAArticle qna = new QNAArticle();

		qna.setNum(1); // 부모
		qna.setTitle("첫 번째 질문입니다."); // 부모
		qna.setAnswer("첫 번째 답변입니다."); // 자식

//		System.out.println(qna.getNum());
//		System.out.println(qna.getTitle());
//		System.out.println(qna.getAnswer());
		System.out.println(qna.toString());

		System.out.println("======================================================");

		FileArticle file = new FileArticle();
		file.setNum(2);
		file.setTitle("두 번째 파일입니다.");
		file.setFileName("2.html");

		System.out.println(file.toString());

	}

}
