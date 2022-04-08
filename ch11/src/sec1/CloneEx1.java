package sec1;

class Car{
	public int number;
	public int speed;
	public String name;
	
	Car(int num){
		this.number = num;
	}
	
}



class Employee implements Cloneable {
	public int no;
	public String name;
	public Car car;
	
	public Employee(int no, String name, Car car) {
		this.no = no;
		this.name = name;
		this.car = car;
	}

	@Override
	//복제할 내용을 기술...
	protected Object clone() throws CloneNotSupportedException {
		
		Employee cloned = (Employee) super.clone();	//얕은 복제. 겉만 복제됨. no,name,car
		//cloned.car = new Car(this.car.number); 	//깊은 복제. 시바 설명 ㅈ같이 해놧네
		return clone();
	}

	@Override
	public String toString() {
		return no +" : " +name;
	}

	@Override
	protected void finalize() throws Throwable {
		System.out.println(no+"인 사원의 객체를 제거.");
		super.finalize();	
	}
	
	
}

public class CloneEx1 {

	public static void main(String[] args) {
		Car car = new Car(1234);
		Employee emp1 = new Employee(1, "정훈", car);
		System.out.println(emp1.toString());
		Employee emp2 = new Employee(2, "정훈", car);
		emp1 = null;
		emp2 = null;
		System.gc();		//null이 된 곳의 finalize를 실행.,,,,>????
		

	}

}
