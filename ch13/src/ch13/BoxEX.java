package ch13;

class Box<T>{		//제네릭. <T> 아무거나 받을 수 있음.  <T, U>가능

	private T t;
	
	public T getT() {return t;}
	public void setT(T t) {this.t = t;}
	
}

public class BoxEX {
	public static void main(String[] args) {
		Box<String> box1 = new Box<>();
		box1.setT("java");
		System.out.println(box1.getT());
		
		Box<Integer> box2 = new Box<Integer>();
		box2.setT(1004);
		System.out.println(box2.getT());
	}

}
