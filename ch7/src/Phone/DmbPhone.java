package Phone;

public class DmbPhone extends CellPhone {

	int channel;
	
	DmbPhone(String model, String color, int channel){
		this.model = model;
		this.color = color;
		this.channel = channel;
	}
	
	public void turnOnDmb() {
		System.out.println("현재"+this.channel+"번 채널의 방송을 시작합니다.");
	}
	
	public void changeChannelDmb(int chan) {
		System.out.println("채널"+chan+"번으로 변경합니다.");
	}
	
	public void turnOffDmb() {
		System.out.println("방송을 종료합니다.");
	}
	
}
