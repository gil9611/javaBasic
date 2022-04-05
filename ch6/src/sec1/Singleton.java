package sec1;
//클래스는 참조형으 자료형 타입
public class Singleton {
	
	
	int num;
	
	
	private static Singleton Singleton = new Singleton();
	private Singleton() {}		//생성자.
	//Singleton 생성자의 접근 제어가 private이므로 현재 클래스 내부에서만 접근 가능.
	
	
	
	static Singleton getInstance() {
		return Singleton;
	}
}
