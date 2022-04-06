package sec4;

public class SmartPhone extends Phone{
	
	SmartPhone(String owner){
		super(owner);
	}

	@Override
	void turnOn() {
		System.out.println("전원을 켭니다");
		
	}

	@Override
	void turnOff() {
		System.out.println("전원을 끕니다");
		
	}
	
	public void internetSearch() {
		System.out.println("웹서칭중");
	}

}
