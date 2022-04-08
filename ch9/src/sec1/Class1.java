package sec1;
class ClassSub{
	int fields1;
	String field2;
	double field3;
}
public class Class1 {
	
	
	public static void main(String[] args) {
		ClassSub sub1 = new ClassSub();
		System.out.println(sub1.fields1);
		mainMethod1();
	}
	
	public static void mainMethod1() {
		System.out.println("메인 메소드 호출");
	}
}
