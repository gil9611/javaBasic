package sec1;

public class ObjectEx1 {
	
	public static void main(String[] args) {
		Object obj1 = new Object();
		Object obj2 = new Object();
		if(obj1 == obj2) {
			System.out.println("동일한 객체");
		} else {
			System.out.println("다른 객체");
		}
		
		if(obj1.equals(obj2)) {
			System.out.println("equals true");
		} else {
			System.out.println("equals false");
		}
	}
	
}
