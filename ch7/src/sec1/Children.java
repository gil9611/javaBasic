package sec1;
//class 클래스명  extends 부모클래스명
public class Children extends Parent{

	double field3;
	Children(){}
	Children(int field1, String field2, double filed3){
		this.field1 = field1;
		this.field2 = field2;
		this.field3 = field3;
		
	}
	
	//부모걸 받아서 그대로 씀. 이걸 안쓰면 못 쓴다. 쓰고, 수정하거나 그대로 사용 가능.
	
	//부모클래스 슈퍼클래스
	//자식클래스 서브클래스
	@Override
	public void method1() {
		// TODO Auto-generated method stub
		System.out.println("난 자식.");
	}
	@Override
	public void method2() {
		// TODO Auto-generated method stub
		super.method2();		//부모 그대로 출력.
	}
	public void method3() {
		
	}
}
