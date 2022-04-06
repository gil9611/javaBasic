package sec2;

public class Car{
	Tire frontLeftTire = new Tire("앞의 왼쪽", 100);
	Tire frontRightTire = new Tire("앞의 오른쪽", 90);
	Tire backLeftTire = new Tire("뒤의 왼쪽", 110);
	Tire backRightTire = new Tire("뒤의 오른쪽", 95);
	
	public int run() {
		
//		frontLeftTire.roll();
//		frontRightTire.roll();
//		backLeftTire.roll();
//		backRightTire.roll();
		System.out.println("가즈아");
		if(frontLeftTire.roll()==false) {
			stop();
			return 1;
		}
		if(frontRightTire.roll()==false) {
			stop();
			return 2;
		}
		if(backLeftTire.roll()==false) {
			stop();
			return 3;
		}
		if(backRightTire.roll()==false) {
			stop();
			return 4;
		}
		return 0;
		
		
	}
	
	public void stop() {
		System.out.println("스탑");
	}

	
	
	

}
