package sec2;


class A {
	int item1;
	void func1() {System.out.println("기능1");}
	static int item2;
	static void func2() {}
	class B{
		void method() {
			item1= 1004;
			func1();
			item2 = 2008;
			func2();
		}
	}
	
	static class S{				//static 클래스이므로 static멤버만 
		void methood() {
			//item1 = 100;
			item2 = 200;
		}
	}
	
	void method() {
		class L{		//public private static 지정 불가
			int field1;
			L() {}
			void method1() {
				item1 = 1;
				item2 = 2;
				func1();
				func2();
			}
		}
	}
}
public class NestedEx {

	public static void main(String[] args) {
		// 겁나 헷갈려.
		A a = new A();
		A.B b = a.new B();
		A.S s = new A.S();
	}

}
