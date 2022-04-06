package Phone;

public class CellPhone {

	String model;
	String color;
	
	public void powerOn() {
		System.out.println("전원을 켭니다.");
	}
	public void powerOff() {
		System.out.println("전원을 끕니다.");
	}
	public void bell() {
		System.out.println("벨이 울립니다.");
	}
	
	//전달한 메세지를 출력
	public void sendVoice(String mes) {
		System.out.println(mes);
	}
	//전달받은 메세지를 출력.
	public void receiveVoidce(String mes) {
		System.out.println(mes);
	}
	
	public void hangUp() {
		System.out.println("전화를 끊습니다.");
	}
}
