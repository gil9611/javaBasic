package sec1;

public class Car {
	private String name;		//자동차이름
	private int style;			//경차1 승용차2 승합차3 화물차4
	private int fuel;			//경유 등유 휘발유 가스 전기 수소
	private int tire;
	private int speed;
	private String num;
	private int usetime;
	
	
	Car(){}
	Car(String name){
		this.name = name;
	}
	Car(String name,int style){
		this.name = name;
		this.style = style;
	}
	Car(String name,int style, int fuel){
		this.name = name;
		this.style = style;
		this.fuel = fuel;
	}
	Car(String name,int style, int fuel, int tire){
		this.name = name;
		this.style = style;
		this.fuel = fuel;
		this.tire = tire;
	}
	Car(String name,int style, int fuel, int tire, int speed){
		this.name = name;
		this.style = style;
		this.fuel = fuel;
		this.tire = tire;
		this.speed = speed;
	}
	Car(String name,int style, int fuel, int tire, int speed, String num){
		this.name = name;
		this.style = style;
		this.fuel = fuel;
		this.tire = tire;
		this.speed = speed;
		this.num = num;
	}
	Car(String name,int style, int fuel, int tire, int speed, String num, int usetime){
		this.name = name;
		this.style = style;
		this.fuel = fuel;
		this.tire = tire;
		this.speed = speed;
		this.num = num;
		this.usetime = usetime;
	}
	
	//주차요금계산
	public int computeMoney(){
		return 0;
	}
	public int computeMoney(int usetime){
		return usetime/60*5000;
	}
	public float computeMoney(int usetime,int style){
		switch(style){
		case 1 : return usetime/60*5000;
		case 2 : return usetime/60*5000*1.2f;
		case 3 : return usetime/60*5000*1.5f;
		case 4 : return usetime/60*5000*2;
		default : return 0;
		}
		
	}
}
