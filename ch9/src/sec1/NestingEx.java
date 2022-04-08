package sec1;

class A {	//외부 클래스
	int item1;
	static int item2;		//여긴 일반적인 클래스라 모든것 사용가능.
	void fun() {System.out.println("외부일반");}
	static void fun2() {System.out.println("외부정적");}
	class B{		//내부 클래스. 보통 안씀
		B() {}
		int field1;
		void method1() {System.out.println("내부 클래스 메서드");}
		
		//static int field2;		// 정적인 멤버는 사용할 수 없다.
		//static void method2(){}
	}

}


public class NestingEx{
	public static void main(String[] args) {
		A a = new A();		//외부멤버
		System.out.println(a.item1);
		System.out.println(A.item2);
		a.fun();
		A.fun2();
		
		A.B b = a.new B();		//내부 멤버의 접근 및 호출.
		System.out.println(b.field1);
		b.method1();
	}
	
}
