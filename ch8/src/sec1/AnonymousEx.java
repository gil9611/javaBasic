package sec1;

public class AnonymousEx {
	public static void main(String[] args) {
		//인터페이스는 선언과 구현을 반드시 해야함.
		//인터페이스선언> 상속> 자식클래스 구현
		RemoteControl rc1 = new RemoteControl() {
			int volume;
			public void turnOn() {System.out.println("전원 온");}
			public void turnOff() {System.out.println("전원 오프");}
			public void setVolume(int volume) {this.volume = volume;}
			public int getVolume() {return volume;}
			
			@Override
			public void search(String url) {
				// TODO Auto-generated method stub
				
			}
		};

	}

}

