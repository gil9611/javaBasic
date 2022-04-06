package sec2;

public class Student extends Human {
	public String no;
	public String part;
	
	Student(){}
	
	//부모속성의 필드도 사용가능
	Student(String name, String jumin, int age, String no, String part){
		
		//super함수는 부모생성자를 호출.
		super(name, jumin);
		super.age =age;		//부모의 필드.
		this.no = no;
		this.part = part;
	}
	public void method1() {
		System.out.println("학생개체입니다.");
	}
	public void method2() {
		//부모의 메소드
		super.method1();
	}
	public void method3() {
		//자기자신 메소드
		this.method1();
	}

}
