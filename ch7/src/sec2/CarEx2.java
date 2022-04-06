package sec2;

public class CarEx2 {

	public static void main(String[] args) {
		Car car1 = new Car();
		for(int i=1;i<110;i++) {
			int errorTire = car1.run();
			switch(errorTire) {
			case 1 : System.out.println("앞왼 타이어 교체");
			car1.frontLeftTire = new kumhoTire("앞왼쪽");
			break;
			case 2 : System.out.println("앞오 타이어 교체");
			car1.frontRightTire = new kumhoTire("앞오른쪽", 30);
			break;
			case 3 : System.out.println("뒤왼 타이어 교체");
			car1.backLeftTire = new kumhoTire("뒤왼쪽");
			break;
			case 4 : System.out.println("뒤오 타이어 교체");
			car1.backRightTire = new kumhoTire("뒤오른쪽");
			break;
			}
			System.out.println("====");
		}
		
		Tire tire0 = new Tire("그냥타이어", 50);
		Tire tire1 = new kumhoTire("그냥타이어", 50);
		Tire tire2 = new MichelinTire("그냥타이어", 50);
		Tire tire3 = new hankookTire("그냥타이어", 50);
		MichelinTire tire4 = new MichelinTire("그냥타이어", 50);
		
		//객체명 instanceof 클래스명 특정클래스로부터 만들어진 인스턴스인지 비교
		System.out.println("tire0 는 tire 클래스로 부터 만들어진 인스턴스인가."+(tire0 instanceof Tire));
		System.out.println("tire0 는 tire 클래스로 부터 만들어진 인스턴스인가."+(tire1 instanceof Tire));
		System.out.println("tire0 는 tire 클래스로 부터 만들어진 인스턴스인가."+(tire4 instanceof Tire));
		//System.out.println("tire0 는 tire 클래스로 부터 만들어진 인스턴스인가."+(tire4 instanceof hankookTire));
		
		//자동 형변환
		tire1 = new MichelinTire("미미");
		
		
		//강제형변환
		//Hankooktire tire6 = (Hankooktire) tire0;
		
		//클래스명 인스턴스명 = 클래스명 부모클래스명;
		
	}

}
