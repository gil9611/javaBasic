package test;

<<<<<<< HEAD
public class Child {
	private String name;
	
	public Child() {
		this("홍길동");
		System.out.println("Child() call");
	}

	public Child(String name) {
		this.name = name;
		System.out.println("Child(String name) call");
=======
public class Child extends Parent {
	private int studentNo;
	
	public Child(String name, int studentNo){
		super.name = name;
		this.studentNo = studentNo;
>>>>>>> eb46fb406a8c80f056d1579fad1155bbdac71fc0
	}
}
