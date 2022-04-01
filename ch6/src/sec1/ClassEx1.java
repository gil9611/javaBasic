package sec1;

public class ClassEx1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Sample1 obj1 = new Sample1();
		System.out.println(obj1.field1);
		obj1.field1 = 100;
		System.out.println(obj1.field1);
		obj1.field1 = 200;
		System.out.println(obj1.field1);
		//
		
		Sample1 obj2 = new Sample1(10);
		System.out.println(obj2.field1);
		System.out.println(obj2.getField1());
		
		//obj2.field2 = 3.14f;	//private때문에 접근 불가.
		System.out.println();
		obj2.setField2(6.14f);	//getter나 setter를 통해서 접근 가능.
		System.out.println(obj2.getField2());
		
		Sample1 obj3 = new Sample1(20, 3.14f);
	}

}
