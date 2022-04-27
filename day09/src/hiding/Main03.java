package hiding;

public class Main03 {

	public static void main(String[] args) {
		Article who = new Article(1, "게시글", "게시 내용", 
							"J학생", 0, "22-03-17");

		System.out.println("글 번호 : " + who.getSeq());
		System.out.println("책 이름 : " + who.getSubject());
		System.out.println("책 내용 : " + who.getContent());
		System.out.println("저자 : " + who.getWriter());
		System.out.println("조회수 : " + who.getHit());
		System.out.println("작성일자 : " + who.getRegDate());
	}

}
