package sec1;

public class ClassEx2 {

	public static void main(String[] args) {
		Class2 obj1 = new Class2();		//객체는 동적 할당.
		obj1.method1();
		//obj1.method2();	//(x)		//문법에 오류는 없으나, 주의 표시가 뜬다. 이렇게 사용하지 않는다.
		Class2.method2();	//(o)		//static 바로 사용.
		//static 객체를 생성하여 활용하는 것이 아니고 원래 클래스 그대로 활용
		
		//Class2.method1(); //(x)		//동적 할당되어있으므로 정적활용 불가.

	}

}
