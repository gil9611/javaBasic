package sec2;

//extends Member 은 못함.
public class Employee extends Human {
	
	//허용은 되나, 부모클래스의 EYE는 여전히 2이고, this.EYE는 4로 별도로 지정된다.
	public final static int EYE = 4;
	
	@Override
	public final void method1() {
		super.method1();
		System.out.println();
	}
	
	/*
	 * final 메소드 오버라이징 불가.
	@Override
	public final void method22() {
		System.out.println("오버라이징 안됨.");
	}
	*/
}
