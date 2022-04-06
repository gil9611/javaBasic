package sec1;
//메인 클래스 : 실행.
public class ExtendsEx1 {

	public static void main(String[] args) {
		Parent p1;		//선언만.
		Parent p2 = new Parent(); 	//선언과 초기화
		//p1.method1();  초기화가 안됐으므로 사용불가.
		
		p1 = new Parent();
		p1.method1();
		p1.method2();
		
		p2.method1();
		p2.method2();
		
		p1 = new Children();		//타입 변경. 부모가 같으면 가능.
		p1.method1();
		p1.method2();
		
		p1 = new Parent();
		p1.method1();
		p1.method2();
		
		p1 = new Sister();
		p1.method1();
		p1.method2();
		
		p1 = new Brother();
		p1.method1();
		p1.method2();
		
		
		//자식 클래스로부터 유도된 인스턴스는 부모클래스의 인스턴스가 될 수 없다.
		Children c1;
		c1 = new Children();
		
		//c1 = new Parent();
		//다른 형제도 안됨.
		//c1 = new Sister();
		}

}
