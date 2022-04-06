package sec4;
//Abstract Class 추상화 클래스
//자세한 실행내용이나 값을 미리 지정하면 나중에 이 클래스를 상속받아 재사용할경우 결과를 모두 일일히 편집하거나 오버라이딩 해야하므로
//구체적인 내용은 기술하지 않고 두루뭉술하게 선언만해서 재사용을 쉽게 하는 클래스.
//상속받을 경우 구체적인 내용을 기술해야한다.
public abstract class Abstract1 {
	int field1;
	Abstract1(){}
	abstract void method1();
}
