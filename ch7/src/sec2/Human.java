package sec2;

public class Human {
	public String name;
	public String jumin;
	public int age;
	public final static int EYE = 2;
	
	//this 함수는 이 생성자를 그대로 부름. this()=Human(String name)
	Human(){this("gil");}
	
	Human(String name){
		this.name = name;
	}
	Human(String name, String jumin){
		this.name = name;
		this.jumin = jumin;
	}
	Human(String name, String jumin, int age){
		this.name = name;
		this.jumin = jumin;
		this.age = age;
	}
	
	public void method1() {
		System.out.println("인간개체입니다.");
	}
	
	
	//final 오버라이징 안됨.
	public final void method22() {
		System.out.println("오버라이징 안됨.");
	}
	
}
