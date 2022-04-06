package sec2;

public class kumhoTire extends Tire {

	kumhoTire(String location) {
		super(location, 40);
	}
	kumhoTire(String location, int max) {
		super(location, max);
	}

	@Override
	public boolean roll() {
		System.out.println("금호타이어로 운행");
		++accRotation;
		if(accRotation<maxRotation) {
			System.out.println(location+"쪽 금호타이어 누적 운행수: "+accRotation);
			System.out.println(location+"쪽 금호타이어 남은 운행수: "+(maxRotation-accRotation));
			return true;
		}	else  {
			System.out.println(this.location+"쪽 금호타이어 펑크");
			return false;
		}
	}
	


}
