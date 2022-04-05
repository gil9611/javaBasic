package sec1;

public class SingletonEX {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//싱글톤은 중복 불가.
		Singleton obj1= Singleton.getInstance();
		Singleton obj2= Singleton.getInstance();
		obj1.num = 1004;
		
		System.out.println(obj2.num);
		obj2.num = 2008;
		System.out.println(obj1.num);
	}

}
