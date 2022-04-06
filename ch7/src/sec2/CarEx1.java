package sec2;

public class CarEx1 {

	public static void main(String[] args) {
		Car car1 = new Car();
		for(int i=1;i<110;i++) {
			int errorTire = car1.run();
			switch(errorTire) {
			case 1 : System.out.println("앞왼 타이어 교체");
			break;
			case 2 : System.out.println("앞오 타이어 교체");
			break;
			case 3 : System.out.println("뒤왼 타이어 교체");
			break;
			case 4 : System.out.println("뒤오 타이어 교체");
			break;
			}
			System.out.println("====");
		}
		

	}

}
