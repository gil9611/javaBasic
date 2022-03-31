package sec1;
//제어문 : 프로그래밍에서 프로그램의 흐름을 제어하는것
//조건 분기문 : 조건에 따라 실행내용이 달라지게 하는 것
//if : if, if/else, if/elseif/else
//switch : switch/case
//반복문 : 프로그래밍상 같은 실행문으로 여러번 실해하게 하는 것.
//for, while, do~while
//기타 제어문
//break, continue


public class IfEx1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String name = "길정훈";
		int kor = 80;
		int eng = 70;
		int mat = 100;
		int tot = kor + eng + mat;
		
		String pass = "불합격";
		//if(조건식) {실행문}
		if (tot>=200) {						//단순 if
			pass= "합격";
		}
		//if (tot>=200) pass= "합격"; 한줄로 쓸 수 있음.
		//pass = (tot>=) ? "합격" : "불합격"; 	//삼항 연산자
		
		System.out.println("합격여부 : " +pass);
		
		if(kor>=90 || eng>=90 || mat>=90) {
			System.out.println("과목우수자");	
		} else {
			System.out.println("과목우수자 대상 아님");
		}

		if(kor>=90 && eng>=90 && mat>=90) {
			System.out.println("장학생");
		} else {
			System.out.println("일반학생");
		}
		//pintln은 줄바꿈. pint문은 붙어서.
		
		//학점 계산.
		System.out.print("학점 : ");
		if (tot>=270) {
				System.out.print("A");
				if(tot>=290) {		//A
					System.out.println("+");
				} else if(tot>=280) {
					System.out.println("0");
				} else {
					System.out.println("-");
				}
		} else if (tot>=240) {		//B 269~240
			System.out.print("B");
			if(tot>=260) {
				System.out.println("+");
			} else if(tot>=250) {
				System.out.println("0");
			} else {
				System.out.println("-");
			}
		} else if (tot>=210) {		//C 239~210
			System.out.print("C");
			if(tot>=230) {
				System.out.println("+");
			} else if(tot>=220) {
				System.out.println("0");
			} else {
				System.out.println("-");
			}
		} else if (tot>=180) {		//D 209~180
			System.out.print("D");
			if(tot>=200) {
				System.out.println("+");
			} else if(tot>=190) {
				System.out.println("0");
			} else {
				System.out.println("-");
			}
		} else {					//F
			System.out.println("get out");
		}
		
		System.out.print("\n");	//줄바꿈.
		//System.out.println();
		
		
		
	}

}
