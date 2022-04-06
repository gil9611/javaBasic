package pack2;
import pack1.A;			//A클래스는 접근제한자가
//import pack1.B;		B클래스는 접근제한자가 default이므로 다른 패키지에서 접근이 불가능
public class C {
	A a = new A();
	//a.field1;			//접근제한자가 protected이므로 같은 패키지이거나 상속관계만 가능. >상속을 받으면 default보다 범위가 넓다..?
	
}
