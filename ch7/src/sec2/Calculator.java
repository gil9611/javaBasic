package sec2;

public class Calculator {
	double areaCircle (double r) {
		System.out.println("입력하신 반지름 : " +r +"의 원의 면적을 구합니다.");
		return 3.14*r*r;
	}
}



class Computer2 extends Calculator {

	@Override
	double areaCircle(double r) {
		System.out.println("입력하신 반지름 : " +r +"의 원의 면적을 구합니다.");
		return Math.PI*r*r;
	}

	
}

