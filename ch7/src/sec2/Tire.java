package sec2;

public class Tire{
	int maxRotation;		//최대 회전수 타이어수명
	int accRotation;		//누적 회전수 
	String location;		//타이어 위치
	
	Tire(String location, int max){
		this.location = location;
		this.maxRotation = max;
	}
	
	
	
	
	public boolean roll() {
		++accRotation;
		if(accRotation<maxRotation) {
			System.out.println(location+"위치, 현재 회전수: "+accRotation);
			System.out.println("남은 회전수: "+(maxRotation-accRotation));
			return true;
		}	else  {
			System.out.println(this.location+"위치 펑크");
			return false;
		}
		
		
	}
	
}

