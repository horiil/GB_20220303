package overload;

public class Article {
	private int seq;
	private String subject;
	private String writer;
	
	// 파라미터가 있는 생성자
	public Article(int seq, String subject, String writer) {
		this.seq = seq;				// 글 번호
		this.subject = subject;		// 글 제목
		this.writer = writer;		// 글 작성자
	}

	public Article(int seq, String writer) {
		this(seq, "제목없음", writer);
//		this.seq = seq;
//		this.subject = "제목없음";
//		this.writer = writer;
	}

	public Article(int seq) {
		this(seq, "제목없음", "익명");
//		this.seq = seq;
//		this.subject = "제목없음";
//		this.subject = "익명";
	}

	// toString()
	@Override	// @Override를 하지않으면 Main4에서 값이 반환되는 것이 아니라 값이 있는 주소값이 출력된다.
	public String toString() {
		return "Article [seq=" + seq 
				+ ", subject=" + subject 
				+ ", writer=" + writer + "]";
	}

	

	
}
