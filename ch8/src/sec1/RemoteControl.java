package sec1;

public interface RemoteControl {
	
	//인터페이스의 구성 멤버
	//필드는 final static이 되어 상수
	//메서드는 abstract
	public int MAX_VOLUME = 100;
	public int MIN_VOLUME = 0;
	
	public void turnOn();
	public void turnOff();
	public void setVolume(int volume);
	public int getVolume();
}
