package sec2;

public class SupersonicAirplane extends AirPlane{
	public static final int NORMAL = 1;
	public static final int SUPERSONIC = 1;
	
	public int flyMode = NORMAL;
	
	
	@Override
	public void fly() {
		if(flyMode == NORMAL) {
			super.fly();
		} else if (flyMode == SUPERSONIC) {
			System.out.println("소닉붐.");
		}
	}
}
