package sec1;
//클래스를 상속받을 때 extends
//인터페이스를 상속받을 때 implements
public class TvRemote implements RemoteControl{
	int volume;
	
	@Override
	public void turnOn() {
		System.out.println("TV전원을 켭니다.");
		
	}

	@Override
	public void turnOff() {
		System.out.println("TV전원을 끕니다.");
		
	}

	@Override
	public void setVolume(int volume) {
		this.volume = volume;
		
	}

	@Override
	public int getVolume() {
		return volume;
	}
	
}
