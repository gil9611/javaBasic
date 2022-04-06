package Phone;

public class PhoneEx {

	public static void main(String[] args) {
		DmbPhone dmb1 = new DmbPhone("안드로이드", "코발트블루", 52);
		
		System.out.println("dmb의 모델은 "+dmb1.getModel());
		System.out.println("dmb의 색갈은 "+dmb1.getColor());
		System.out.println("dmb의 채널은 "+dmb1.getChannel());
		
		dmb1.powerOn();
		dmb1.bell();
		
		dmb1.sendVoice("여보세요");
		dmb1.receiveVoidce("안녕하셨습니까");
		
		dmb1.hangUp();
		
		dmb1.turnOnDmb();
		dmb1.changeChannelDmb(12);
		dmb1.turnOffDmb();

	}

}
