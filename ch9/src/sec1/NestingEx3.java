package sec1;
//로컬 클래스: 특정 클래스의 메서드 안의 내부클래스


class E {
	void method() {		//메소드 구성은 default만 가능 public private static 사용 불가.
		class F{
			F(){}
			int field1;
			//static int field2;
			void method1() {System.out.println("내부 매서드");}
		}
		F f = new F();
		f.field1 = 50;
		f.method1();
	}
}


public class NestingEx3 {

	public static void main(String[] args) {
		E e = new E();
		e.method();

	}

}
