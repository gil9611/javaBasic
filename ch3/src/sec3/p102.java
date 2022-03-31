package sec3;

public class p102 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//2
		int x = 10;
		int y = 20;
		int z = (++x) + (y--);
		System.out.println(z);
		//3
		int score = 85;
		String result = (!(score>90)) ? "가" :"나";
		System.out.println(result);
		
		//4
		int pencils = 534;
		int students = 30;
		
		//학생 한 명이 가지는 연필 수 
		int pencilsPerStudent = pencils/students;
		System.out.println(pencilsPerStudent);
		
		//남은 연필수
		int pencilsLeft = pencils%students;
		System.out.println(pencilsLeft);
		
		//5
		int value = 356;
		System.out.println(value/100*100);
		System.out.println(value-(value%100));
		
		//6
		int lengthTop = 5;
		int lengthBottom = 10;
		int height = 7;
		double area = (lengthTop + lengthBottom)/2.0f * height;
		System.out.println(area);
		
		//7
		int x1 = 10;
		int y1 = 5;
		
		System.out.println((x1>7) && (y1<=5));
		System.out.println((x1%3==2) || (y1%2 != 1));
		
		//8
		double x2 = 5.0;
		double y2 = 0.0;
		
		double z2 = x%y;
		
		if(Double.isNaN(z2)) {
			System.out.println("못함ㅅㄱ");
		}else {
			double result2 = z+10;
			System.out.println("결과: " +result2);
		}
			
		
	}

}
