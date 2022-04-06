package sec2;


//public final class : 더이상 상속해줄 수 없는 클래스.
public final class Member extends Human{
	String id;
	String pw;
	public void join() {
		System.out.println("회원가입");
	}
	public void login() {
		System.out.println("로그인");
	}
	
	public void modify() {
		System.out.println("수정");
	}

}
