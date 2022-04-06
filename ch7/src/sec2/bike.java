package sec2;

public class bike {
	Tire frontTire = new Tire("앞쪽", 200);
	Tire backTire = new Tire("뒤쪽", 150);
	
	public int run() {
		System.out.println("부르를ㅇ");
		if(frontTire.roll()==false) {stop(); return 1;}
		if(backTire.roll()==false) {stop(); return 2;}
		return 0;
	}
	
	public void stop() {
		System.out.println("젠장쿠뽀");
	}
}
