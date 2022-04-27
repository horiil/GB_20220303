package Abstract;

// 추상 메서드는 추상 클래스에서만 정의되기에 오류가 난다.
// 그렇기에 클래스앞에 추상 클래스임을 가리키는 abstract를 써주자
public abstract class Hello {
	private String msg;

	public Hello(String msg) {
		super();
		this.msg = msg;
	}

	public String getMsg() {
		return msg;
	}

	public void setMsg(String msg) {
		this.msg = msg;
	}

//	추상 메서드는 추상 클래스에서만 정의되기에 오류가 난다.
	public abstract void sayHello();
	
	
	
}





